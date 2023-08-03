SUMMARY = "Electronic Design Automation platform featuring prototype to product"
DESCRIPTION = "Fritzing is an initiative to support designers, artists, \
researchers and hobbyists to take the step from physical prototyping \
to an actual product. It is in the spirit of Processing and Arduino which \
allow users to document their Arduino and other electronic-based \
prototypes, and to create a PCB layout for manufacturing."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "fritzing-0.9.4-1.26.aarch64.rpm"
RPM_HASH = "0fdac146501faa6a201c559710443ab51ad8ae50474c5721291a7deb99682c535cb9b71696a6e82a4117d234e4479c176e678349f071b11d4b70078165f56f5d"

RPROVIDES:${PN} += "fritzing"

RDEPENDS:${PN} += "/usr/bin/sh \
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
libgit2.so.1.7 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
shared-mime-info"

inherit rpm
