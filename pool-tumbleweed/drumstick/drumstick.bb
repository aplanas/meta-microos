SUMMARY = "MIDI Sequencer C++ Library Bindings"
DESCRIPTION = "This package includes test and example programs for drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "91c60760294f020b13084a956f657d01802b85c72b845bc6c31c1f98cecf8f96c70dbb70bdf4b38ff72d7a5acd94728fbe096814395dcf3ce2bc47721f20ae39"

RPROVIDES:${PN} += "application() \
application(net.sourceforge.drumstick-drumgrid.desktop) \
application(net.sourceforge.drumstick-guiplayer.desktop) \
application(net.sourceforge.drumstick-vpiano.desktop) \
drumstick \
drumstick(aarch-64) \
metainfo() \
metainfo(net.sourceforge.drumstick-drumgrid.metainfo.xml) \
metainfo(net.sourceforge.drumstick-guiplayer.metainfo.xml) \
metainfo(net.sourceforge.drumstick-vpiano.metainfo.xml) \
mimehandler(audio/cakewalk) \
mimehandler(audio/midi) \
mimehandler(audio/x-midi)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrumstick-alsa.so.2()(64bit) \
libdrumstick-file.so.2()(64bit) \
libdrumstick-rt.so.2()(64bit) \
libdrumstick-widgets.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
