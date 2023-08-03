SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickTemplates2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ade3bc75a193e3474506020ec0198b1927d78fc44123a6fb9200510608907606da1ebfd8f9a71b9955768c441eb099e37ea6e0309f63491e5725d05a99809b07"

RPROVIDES:${PN} += "qt6-quicktemplates2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTemplates2 \
qt6-qmlmodels-private-devel"

inherit rpm
