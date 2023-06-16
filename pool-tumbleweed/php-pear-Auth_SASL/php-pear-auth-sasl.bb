SUMMARY = "Abstraction of various SASL mechanism responses"
DESCRIPTION = "Provides code to generate responses to common SASL mechanisms, including: \
  - Digest-MD5 \
  - CramMD5 \
  - Plain \
  - Anonymous \
  - Login (Pseudo mechanism)"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "php-pear-Auth_SASL-1.1.0-1.10.noarch.rpm"
RPM_HASH = "eb10db89bd1818abcc7bf14b7818879135eef0fd9713fcb51dadb2d94eab9613f343ff4f18d0a14ee9e0de1914ccc900c27793e8631f2380896d811198111ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Auth-SASL \
php5-pear-Auth-SASL \
php7-pear-Auth-SASL"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
