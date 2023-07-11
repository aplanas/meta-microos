SUMMARY = "Pulseaudio support for ptlib"
DESCRIPTION = "This plugin enables pulseaudio support for ptlib."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-plugins-pulse-2.18.8-1.7.aarch64.rpm"
RPM_HASH = "fbe7c8ab1631298f60a1e32723f48d6545ac87aa546944321f918f2fa59a6da26c07005f3210816b73fd1fa6744b6704ceb2df7557ac8ab7a4d16862ed41005d"

RPROVIDES:${PN} += "libpt2-18-8-plugins-pulse \
libpt2-audio-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpt.so.2.18.8 \
libpt2-18-8 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
