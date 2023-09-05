SUMMARY = "OWASP ModSecurity Common Rule Set (CRS)"
DESCRIPTION = "The OWASP ModSecurity Core Rule Set (CRS) is a set of generic attack detection rules for use with ModSecurity \
or compatible web application firewalls. The CRS aims to protect web applications from a wide range of attacks, \
including the OWASP Top Ten, with a minimum of false alerts."
LICENSE = "Apache-2.0"

PV = "3.3.5"

RPM_NAME = "owasp-modsecurity-crs-3.3.5-1.1.noarch.rpm"
RPM_HASH = "4d9b15977946a02828b30f5466b0470f84647c096120c712c4558625bb909d567f0de94bbb5f315f344aa12dc3d555b64b717a03e60b739998112e1851ad7db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "owasp-modsecurity-crs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl"

inherit rpm
