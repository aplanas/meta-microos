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
libmatemixer-alsa.so \
libmatemixer-null.so \
libmatemixer-pulse.so \
libmatemixer.so.0 \
libmatemixer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
