SUMMARY = "Electronic Design Automation platform featuring prototype to product"
DESCRIPTION = "Fritzing is an initiative to support designers, artists, \
researchers and hobbyists to take the step from physical prototyping \
to an actual product. It is in the spirit of Processing and Arduino which \
allow users to document their Arduino and other electronic-based \
prototypes, and to create a PCB layout for manufacturing."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "fritzing-0.9.4-1.24.aarch64.rpm"
RPM_HASH = "add794b7d756f913fa2edf8f043d20cc55cfcc73702450b0596663b281f91b745094e528d9ea582a0a210af36629e91098507f2f8fa0e4b1372a1f6ad24599a8"

RPROVIDES:${PN} += "fritzing"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
fritzing-parts \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgit2.so.1.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
shared-mime-info"

inherit rpm
