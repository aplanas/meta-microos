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

RPROVIDES:${PN} += "application() \
application(org.fritzing.Fritzing.desktop) \
fritzing \
fritzing(aarch-64) \
metainfo() \
metainfo(org.fritzing.Fritzing.appdata.xml) \
mimehandler(application/x-fritzing-fz) \
mimehandler(application/x-fritzing-fzb) \
mimehandler(application/x-fritzing-fzbz) \
mimehandler(application/x-fritzing-fzm) \
mimehandler(application/x-fritzing-fzp) \
mimehandler(application/x-fritzing-fzpz) \
mimehandler(application/x-fritzing-fzz)"
RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
fritzing-parts \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgit2.so.1.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit) \
shared-mime-info"

inherit rpm
