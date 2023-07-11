SUMMARY = "Manual and sample code for sblim-cim-client2"
DESCRIPTION = "Manual and sample code for sblim-cim-client2."
LICENSE = "EPL-1.0"

PV = "2.2.5"

RPM_NAME = "sblim-cim-client2-manual-2.2.5-7.4.noarch.rpm"
RPM_HASH = "4d63d12d85911e003b2fe8d4d690bf181dfb6207244495cd2f386fb63bcdfac655a0fe24c35658187eaa5c0df03c0d530c7b770c82e4e0830075bb3bad8705ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sblim-cim-client2-manual"

RDEPENDS:${PN} += ""

inherit rpm
