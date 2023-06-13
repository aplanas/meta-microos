SUMMARY = "Testing TLS/SSL Encryption Anywhere On Any Port"
DESCRIPTION = "testssl.sh is a free command line tool which checks a server's service on \
any port for the support of TLS/SSL ciphers, protocols as well as some \
cryptographic flaws."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "testssl.sh-3.0.8-1.2.noarch.rpm"
RPM_HASH = "cc3bc4fda9389e03aa0eb0c333001bf730229f6d902a35467eb49ecf36f8608b2bdeaf8924dc7bc8ac1be0ff6373e5d96c7fe16a05bc462f618d6e86b218be42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "testssl.sh"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
bind-utils \
openssl"

inherit rpm
