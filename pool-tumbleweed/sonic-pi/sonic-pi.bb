SUMMARY = "Livecoding environment for musicians and schools"
DESCRIPTION = "Sonic Pi is a new kind of musical instrument. Instead of strumming strings or whacking things with sticks - you write code - live."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "sonic-pi-4.3.0-1.4.aarch64.rpm"
RPM_HASH = "de7c05ebe1936be83271e62d78b2e65c102dabba28227613af4056318a2217907dce956ca410cba13200abe9efc4d49c3ad87cde472a0229c65174c61d6bcb62"

RPROVIDES:${PN} += "libsp-link.so \
libsp-midi.so \
sonic-pi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/ruby \
/usr/bin/sh \
jack-example-tools \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libaubio.so.5 \
libc.so.6 \
libcrypto.so.3 \
libffi.so.8 \
libfmt.so.9 \
libgcc-s.so.1 \
libkissfft-float.so.131 \
libm.so.6 \
libplatform-folders.so \
libqscintilla2-qt5.so.15 \
libreproc++.so.14 \
librtmidi.so.6 \
libruby3.2.so.3.2 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libtinfo.so.6 \
libz.so.1 \
lua \
ruby \
supercollider"

inherit rpm
