SUMMARY = "Rescue Helicopter Simulator"
DESCRIPTION = "Search and Rescue II (SaR II) is an open source helicopter simulator game for \
Linux and OSX. In it you can fly several helicopter and airplane models in \
some basic scenarios. \
 \
SaR II has low graphic requirements while still provides a fun and demanding \
gameplay where the player needs to locate, pick-up and rescue victims of all \
sorts in steep mountains, burning buildings or in the sea."
LICENSE = "GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "sar2-2.5.0-2.4.aarch64.rpm"
RPM_HASH = "c423b8365af2108d818fcf73cded9c39a4f0aac9c82245b216a4752200f105a50f1ce9c2654f6b05ee6106a1c342e5e4c3c5236497d9cabdd4b15c149103c4c6"

RPROVIDES:${PN} += "sar2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libICE.so.6 \
libSDL2-2.0.so.0 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3 \
sar2-data"

inherit rpm
