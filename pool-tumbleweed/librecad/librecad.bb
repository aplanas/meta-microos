SUMMARY = "Computer-aided design (CAD) software package for 2D design and drafting"
DESCRIPTION = "LibreCAD is a Qt Computer-aided design (CAD) software package for 2D design \
and drafting."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0.2"

RPM_NAME = "librecad-2.2.0.2-1.1.aarch64.rpm"
RPM_HASH = "87fba25029454e72023fe442662812bb21f13202fe1dbc27848206288050dd7c9b31384a6c842e19235667f0d0f35c556622cf7e487f8c1c90416f82e1ea7189"

RPROVIDES:${PN} += "libalign.so \
libasciifile.so \
libdivide.so \
libgear.so \
liblist.so \
libpicfile.so \
libplotequation.so \
librecad \
libsameprop.so \
libsample.so"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdxfrw.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmuparser.so.2.3.4 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
