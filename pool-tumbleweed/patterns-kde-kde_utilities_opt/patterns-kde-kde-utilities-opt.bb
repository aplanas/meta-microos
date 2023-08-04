SUMMARY = "KDE Utilities"
DESCRIPTION = "KDE Application - Additional Utilities"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_utilities_opt-20230801-1.1.noarch.rpm"
RPM_HASH = "7df807fc8e1ccd3832653122f81c6b05661c9751cfb802fa0ae50effb5031fc4dc235c6877b565d9f68df7d14eb04c679223cd5a3ae4ea25baa41cb80ad115aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-utilities-opt \
patterns-openSUSE-kde-utilities-opt \
patterns-openSUSE-kde4-utilities-opt"

RDEPENDS:${PN} += ""

inherit rpm
