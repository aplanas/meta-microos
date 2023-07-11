SUMMARY = "Qt bindings for PulseAudio"
DESCRIPTION = "Pulseaudio-Qt is a library providing Qt bindings to PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "libKF5PulseAudioQt3-1.3-1.11.aarch64.rpm"
RPM_HASH = "492dda7967530033a1dc9db2c8f45e2950b75d906efd804f46892a89fa0f5e3755b5fb118b480c8b730200309a190f991e71bd61b760b4c21ae8cbb2d92a2284"

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
