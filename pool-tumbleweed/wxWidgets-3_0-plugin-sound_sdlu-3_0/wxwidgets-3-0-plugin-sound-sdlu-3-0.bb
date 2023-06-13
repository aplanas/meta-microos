SUMMARY = "wxWidgets SDL Plugin"
DESCRIPTION = "SDL Plugin for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-plugin-sound_sdlu-3_0-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "40062c6dfbdd9e2b498af6b4cac415ea6152b9b99bb05218c8fd06c86fa128891e6d2a0636e9db43d945617af95a3e587c195bae24488221f7baced0afba5554"

RPROVIDES:${PN} += "wxWidgets-3_0-plugin-sound_sdlu-3_0 \
wxWidgets-3_0-plugin-sound_sdlu-3_0(aarch-64)"

RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
