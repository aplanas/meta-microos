SUMMARY = "AdLib Sound Player Library"
DESCRIPTION = "AdPlug is a hardware independent AdLib sound player library. \
AdPlug plays sound data, originally created for the AdLib (OPL2) and \
Sound Blaster (Dual OPL2/OPL3) audio boards, directly from its original \
format on top of an emulator or by using the real hardware. \
No OPL chip is required for playback."
LICENSE = "LGPL-2.1-only"

PV = "2.3.3"

RPM_NAME = "libadplug2_3_3-0-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "e612c4fb78f8d2b607eaa9115eecb8ea29681d0b2f08b1a41c6339a6d8eb34f8d18744a9f5b03ea60fa5ebe159c1a52b08dfecc92ed1018c380ac2e577bf6b29"

RPROVIDES:${PN} += "libadplug-2.3.3.so.0 \
libadplug2-3-3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbinio.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
