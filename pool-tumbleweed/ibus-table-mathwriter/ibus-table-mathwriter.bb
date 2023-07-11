SUMMARY = "Mathematics symbols table for ibus-table"
DESCRIPTION = "The package contains table for writing Unicode mathematics symbols."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-mathwriter-1.3.16-1.1.noarch.rpm"
RPM_HASH = "1e3e0bbdcd2b5e342995673204795abbf7ffcf0a0b92818aecbde7de388285eb5888665bf2025109df0620ce53f92b0bd896087e45df8192e77ad5271e3a0b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-mathwriter"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
