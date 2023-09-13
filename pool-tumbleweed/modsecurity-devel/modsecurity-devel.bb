SUMMARY = "Development files for modsecurity, a web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control. \
 \
This subpackage holds the development headers for the library."
LICENSE = "BSD-2-Clause"

PV = "3.0.10"

RPM_NAME = "modsecurity-devel-3.0.10-1.1.aarch64.rpm"
RPM_HASH = "d01e32eabd08eb95a90a59702b6168e8d612c24dac3d989b25bb627cb99f5e42f422ffdd49cacf26db2016fb46f7a6f98748f066c4ef40d15a80c011a786dc51"

RPROVIDES:${PN} += "modsecurity-devel \
pkgconfig-modsecurity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodsecurity3"

inherit rpm
