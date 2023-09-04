SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-tenant-7.4.0-1.1.noarch.rpm"
RPM_HASH = "ea609ff88d4223fec4794771be632684ec29fe0ed3bbd1b6b0c925580863046cf1bfbe2696f3f5422271e1afd848e8464137bfc5804c290885781aa264b86902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"

RDEPENDS:${PN} += "keylime-config \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
