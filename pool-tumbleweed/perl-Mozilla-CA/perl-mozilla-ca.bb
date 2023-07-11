SUMMARY = "Mozilla's CA cert bundle in PEM format"
DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL. \
 \
The module provide a single function: \
 \
* SSL_ca_file() \
 \
Returns the absolute path to the Mozilla's CA cert bundle PEM file."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "20221114"

RPM_NAME = "perl-Mozilla-CA-20221114-1.2.noarch.rpm"
RPM_HASH = "86974b8fe496511edb93abb6e37318b902f2567628cf1111428d583255811157dc1dac163c7b8153d60de879f68048b28ae5b000dff51655d262143d911982d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mozilla--CA \
perl-Mozilla-CA"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
