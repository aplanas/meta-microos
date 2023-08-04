SUMMARY = "KDE Integrated Development Environment"
DESCRIPTION = "KDE software for development (editors, integrated development environments, and associated tools)."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_ide-20230801-1.1.noarch.rpm"
RPM_HASH = "5ee0493097f42b73c9542a0f2c1ec728cadbbce77eb0c6b8a017d405e2eb9f1d019bc76d73bcfd81cb7855b49c9ca823db3191a119837f6305f2dce931442a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-ide \
patterns-openSUSE-kde-ide \
patterns-openSUSE-kde4-ide"

RDEPENDS:${PN} += ""

inherit rpm
