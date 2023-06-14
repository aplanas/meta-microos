SUMMARY = "KDE PIM Suite"
DESCRIPTION = "The KDE PIM Suite (Kontact, KMail, KOrganizer, ...)."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_pim-20230403-1.1.noarch.rpm"
RPM_HASH = "5e78a07ef06d42e9c0041120b3ab14f739f21824f06799b2223b94f5e50e9d541e5b8aa5f87301187d4fa7015139dcad1aa40923cabaf25e8e39ac891384ad26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde-pim"

RDEPENDS:${PN} += ""

inherit rpm
