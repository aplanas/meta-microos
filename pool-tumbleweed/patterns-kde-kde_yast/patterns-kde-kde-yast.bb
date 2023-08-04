SUMMARY = "YaST KDE User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for the KDE desktop."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_yast-20230801-1.1.noarch.rpm"
RPM_HASH = "e5242e637118f9c59ef80820a6aefa0c78810e2262b1c39f61c8bf60aee66494b4530ce2151834837d2c35cbe3c339d0d9f06158a7d09c9dacffe6a2113df733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-yast \
patterns-kde-sw-management-kde \
patterns-openSUSE-kde-yast \
patterns-openSUSE-kde4-yast \
patterns-openSUSE-sw-management-kde \
patterns-openSUSE-sw-management-kde4"

RDEPENDS:${PN} += "libyui-qt-pkg \
yast2-control-center-qt"

inherit rpm
