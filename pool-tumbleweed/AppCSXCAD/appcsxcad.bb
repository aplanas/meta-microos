SUMMARY = "Minimal GUI Application using the QCSXCAD library"
DESCRIPTION = "Minimal GUI Application using the QCSXCAD library."
LICENSE = "GPL-3.0-only"

PV = "0.2.2"

RPM_NAME = "AppCSXCAD-0.2.2-2.17.aarch64.rpm"
RPM_HASH = "fd98cb085e540de65cf60f0c4c23e0759e0e3636435660bac51ef8d2ac9a9e1fd16d208ca5b42874a6e25fd902ab118874b6c60bdad0a4f71bce8314eb53a38b"

RPROVIDES:${PN} += "AppCSXCAD"

RDEPENDS:${PN} += "/usr/bin/bash \
libCSXCAD.so.0 \
libQCSXCAD.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvtksys.so.1"

inherit rpm
