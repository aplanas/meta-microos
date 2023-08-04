SUMMARY = "KDE PIM Suite"
DESCRIPTION = "The KDE PIM Suite (Kontact, KMail, KOrganizer, ...)."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_pim-20230801-1.1.noarch.rpm"
RPM_HASH = "b3b8bda83377ea1784c05933638e884f5d3fd266081c5baaa5a1684a084a83f12ff6956dea049d9e3eddad574f085347c428ff74371545d8dc9922a6583f2e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde-pim"

RDEPENDS:${PN} += ""

inherit rpm
