SUMMARY = "Development files for QCSXCAD"
DESCRIPTION = "A Qt-GUI for the CSXCAD library. \
 \
This package contains libraries and header files for developing \
applications that use QCSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "QCSXCAD-devel-0.6.2-5.5.aarch64.rpm"
RPM_HASH = "7e74aaa20fabbeec2dd124411431713c90c3ff8eb57642111b548bada255f86dc60baf67a3362ee0e28834de8a49947a3afd0a68677957aa238d48d67fffc7d9"

RPROVIDES:${PN} += "QCSXCAD-devel \
QCSXCAD-devel(aarch-64)"
RDEPENDS:${PN} += "libQCSXCAD0"

inherit rpm
