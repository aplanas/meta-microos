SUMMARY = "Development files for KQuickImageEditor"
DESCRIPTION = "Development files for KQuickImageEditor, a set of QtQuick components providing \
basic image editing capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "kquickimageeditor-devel-0.2.0-1.11.aarch64.rpm"
RPM_HASH = "52e0291ea0658e30e9d2cc674d9d301f547d6ba3bb8c9d9ef8cdce4212a563b554b0aef5f9982e230db3cb84a80eca403470fd0dc7240f24c153e7c0ad49182a"

RPROVIDES:${PN} += "cmake-KQuickImageEditor \
kquickimageeditor-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Quick \
kquickimageeditor-imports"

inherit rpm
