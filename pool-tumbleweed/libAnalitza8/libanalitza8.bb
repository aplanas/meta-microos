SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libAnalitza8-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "33fcd73cc5de630df8aea1f1de705e15b53d2b024c79f8e607312e98264fcecd32be4bd732bac1d9ade790ce80f45d1cc33cbe9fbb4ab8e8f224d3b8c0ade17e"

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
