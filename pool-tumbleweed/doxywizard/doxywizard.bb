SUMMARY = "Graphical User Interface for Doxygen"
DESCRIPTION = "Doxywizard is a graphical front-end to read/edit/write doxygen \
configuration files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "1.9.6"

RPM_NAME = "doxywizard-1.9.6-5.1.aarch64.rpm"
RPM_HASH = "e77208edf295be98b76703754196e93cef7c26c247b48f503b469fdbc2cf77dbdb999af9366c23bc7803d626f867481aa6c54c10bd7b76ff6bbfe17dabb15823"

RPROVIDES:${PN} += "doxywizard"

RDEPENDS:${PN} += "doxygen \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
