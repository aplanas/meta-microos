SUMMARY = "Qt bindings for PulseAudio"
DESCRIPTION = "Pulseaudio-Qt is a library providing Qt bindings to PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "libKF5PulseAudioQt3-1.3-1.10.aarch64.rpm"
RPM_HASH = "0119f82735372f21f6a21e786fcf78f1da2ddcf376bfe1280696ee3bd69903d8d52d76abdd428260ae94bd7ab7bc2c2a8a0c5294ff4c3f677cb3b64a2a071f4b"

RPROVIDES:${PN} += "libKF5PulseAudioQt.so.3 \
libKF5PulseAudioQt3 \
pulseaudio-qt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
