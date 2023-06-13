SUMMARY = "GNOME Base System"
DESCRIPTION = "Base packages for the GNOME desktop environment."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_basis_opt-20201210-16.1.aarch64.rpm"
RPM_HASH = "c3f00f8477d53645f0d5f62a5d625985b3b1e062fb5fbd6efd5b6822bea1551dbf9364b65fa9eecd1e7b737c4a34060525568f7a6e8d9b2140cbb33b19a96736"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_basis_opt \
patterns-gnome-gnome_basis_opt(aarch-64) \
patterns-openSUSE-gnome_basis_opt"

RDEPENDS:${PN} += "pattern()"

inherit rpm
