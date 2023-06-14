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

RPM_NAME = "sar2-2.5.0-2.3.aarch64.rpm"
RPM_HASH = "6ee55e51ffed6d4c99a37250a44b3d88364b388d889c0a045e903826cfd67370c6f25599bcc20de9c881bec5df9d9316a81e9df0cb5c7948f0fd74bf6c80bf4e"

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
