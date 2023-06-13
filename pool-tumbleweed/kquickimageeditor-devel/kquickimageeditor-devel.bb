SUMMARY = "Development files for KQuickImageEditor"
DESCRIPTION = "Development files for KQuickImageEditor, a set of QtQuick components providing \
basic image editing capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "kquickimageeditor-devel-0.2.0-1.10.aarch64.rpm"
RPM_HASH = "ac76fd4cf71af51d196ee313e91afce162578732b01123ca0de6337f3a6a892c688443479c1a9a60e52a2642316edbaac2993e8a1d89e4eafd5e54b37471d7b3"

RPROVIDES:${PN} += "cmake(KQuickImageEditor) \
kquickimageeditor-devel \
kquickimageeditor-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Core) \
cmake(Qt5Quick) \
kquickimageeditor-imports"

inherit rpm
