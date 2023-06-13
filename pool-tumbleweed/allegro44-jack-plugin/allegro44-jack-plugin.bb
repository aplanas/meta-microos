SUMMARY = "Allegro JACK (Jack Audio Connection Kit) plugin"
DESCRIPTION = "This package contains a plugin for Allegro which enables Allegro to playback \
sound through JACK (Jack Audio Connection Kit)."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-jack-plugin-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "49ea1b73c6a2ca95a034a3e432eda1e66983cc4f573594ab65ad1c1997a9b0c1e29953c64d0b4eae5f635b6595db44178b47e1dfcc0d8e4159c6f40cd21c6144"

RPROVIDES:${PN} += "allegro44-jack-plugin \
allegro44-jack-plugin(aarch-64)"

RDEPENDS:${PN} += "allegro44 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballeg.so.4.4()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libjack.so.0()(64bit)"

inherit rpm
