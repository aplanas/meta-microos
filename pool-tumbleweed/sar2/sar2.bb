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

RPROVIDES:${PN} += "application() \
application(sar2.desktop) \
metainfo() \
metainfo(sar2.appdata.xml) \
sar2 \
sar2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libICE.so.6()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXxf86vm.so.1()(64bit) \
libalut.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopenal.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
sar2-data"

inherit rpm
