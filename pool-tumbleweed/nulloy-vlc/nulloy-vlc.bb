SUMMARY = "VLC plugin for nulloy"
DESCRIPTION = "This package contains the vlc playback plugin for nulloy - a lightweight \
music player with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-vlc-0.9.5-1.9.aarch64.rpm"
RPM_HASH = "c3137ef7de6735d178e9aa8e2f89599f2fc4952997eb77eeb08a354a7243519e6a0c9b9df3f8b6338f749a9767ca7814ccf5f9cde015e953f07bed52f63043f3"

RPROVIDES:${PN} += "libplugin_vlc.so()(64bit) \
nulloy-vlc \
nulloy-vlc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvlc.so.5()(64bit) \
nulloy"

inherit rpm
