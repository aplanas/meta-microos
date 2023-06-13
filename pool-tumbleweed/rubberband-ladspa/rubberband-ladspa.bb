SUMMARY = "LADSPA plugin for librubberband"
DESCRIPTION = "Package rubberband-ladspa is LADSPA plugin that can change the pitch of a sound in real-time."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-ladspa-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "394598cafc841f65b70b0037a5c10bd4f5546057e489650ebb410101b177b819421098a56a37c10be4688c339d89a1c24f7defa55d7210f315b549f349a68e64"

RPROVIDES:${PN} += "rubberband-ladspa \
rubberband-ladspa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
librubberband2 \
libstdc++.so.6()(64bit)"

inherit rpm
