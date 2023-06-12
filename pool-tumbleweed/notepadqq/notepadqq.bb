SUMMARY = "Notepad++-like editor"
DESCRIPTION = "Text editor with support for multiple programming languages, \
multiple encodings, and plugins."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~20201022T180930.03cdde0"

RPM_NAME = "notepadqq-2.0.0~20201022T180930.03cdde0-1.10.aarch64.rpm"
RPM_HASH = "ddfa416c96c8b7ae3a97a40470b50afec8eca62e2c25b522168a3333cf481de44434d4dd024c9974e12bae3a7ba728f49079ea1d733e89ae92c311cf71fe70eb"

RPROVIDES:${PN} += "application() \
application(notepadqq.desktop) \
metainfo() \
metainfo(notepadqq.appdata.xml) \
mimehandler(text/html) \
mimehandler(text/plain) \
mimehandler(text/x-c) \
mimehandler(text/x-php) \
mimehandler(text/x-shellscript) \
notepadqq \
notepadqq(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/node \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libuchardet.so.0()(64bit)"

inherit rpm
