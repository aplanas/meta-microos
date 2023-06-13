SUMMARY = "Livecoding environment for musicians and schools"
DESCRIPTION = "Sonic Pi is a new kind of musical instrument. Instead of strumming strings or whacking things with sticks - you write code - live."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "sonic-pi-4.3.0-1.4.aarch64.rpm"
RPM_HASH = "de7c05ebe1936be83271e62d78b2e65c102dabba28227613af4056318a2217907dce956ca410cba13200abe9efc4d49c3ad87cde472a0229c65174c61d6bcb62"

RPROVIDES:${PN} += "application() \
application(sonic-pi.desktop) \
libsp_link.so()(64bit) \
libsp_midi.so()(64bit) \
sonic-pi \
sonic-pi(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/ruby \
jack-example-tools \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libaubio.so.5()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libffi.so.8()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libkissfft-float.so.131()(64bit) \
libm.so.6()(64bit) \
libplatform_folders.so()(64bit) \
libqscintilla2_qt5.so.15()(64bit) \
libreproc++.so.14()(64bit) \
librtmidi.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
lua \
ruby \
supercollider"

inherit rpm
