SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libAnalitza8-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "65a5fe86e5d992f134be0f1ee2c06a086f9e12598861c825647c14621640dc5e267b9e14b47857ec318e45551b897de499786bc950df44f0e7d174f776c74a9a"

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
