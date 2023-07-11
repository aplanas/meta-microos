SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libAnalitza8-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4f112e142c456f54a4e9c0f241b31b818d648bdf616b28bae12e5531ea0ab4d2108ae5d5aa2a501bf50651e7fa3e86309323cb979b496f245d4e2959dfed7beb"

RPROVIDES:${PN} += "libAnalitza.so.8 \
libAnalitza8 \
libAnalitzaGui.so.8 \
libAnalitzaPlot.so.8 \
libAnalitzaWidgets.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
analitza \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
