SUMMARY = "KDE Utilities"
DESCRIPTION = "KDE Applications - Utilities"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_utilities-20230801-1.1.noarch.rpm"
RPM_HASH = "18f0579c6bfb225bfce73a28ad76f252bd5787817fa1252b227a9afcbffe9f891544510a1fa46333789d3544d9a60a6f4793b9347626661a1f68ff639c0c987e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-utilities \
patterns-openSUSE-kde-utilities \
patterns-openSUSE-kde4-utilities"

RDEPENDS:${PN} += ""

inherit rpm
