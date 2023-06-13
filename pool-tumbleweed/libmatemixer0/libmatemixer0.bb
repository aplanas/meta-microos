SUMMARY = "Mixer library for MATE Desktop"
DESCRIPTION = "libmatemixer is a mixer library for MATE desktop. \
 \
It provides an abstract API allowing access to mixer functionality \
available in the PulseAudio, ALSA and OSS sound systems."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmatemixer0-1.26.0-1.8.aarch64.rpm"
RPM_HASH = "5ed74fd4a8637f689c0925791c350f0f9e0743e93ee38fc0204ade289dea06a56043b328acc7592f1064cbd64a5570cdf90b8645c2fcd56d836a6203174fd1f4"

RPROVIDES:${PN} += "libmatemixer \
libmatemixer-alsa.so()(64bit) \
libmatemixer-null.so()(64bit) \
libmatemixer-pulse.so()(64bit) \
libmatemixer.so.0()(64bit) \
libmatemixer0 \
libmatemixer0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
