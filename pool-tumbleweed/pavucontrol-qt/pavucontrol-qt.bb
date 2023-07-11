SUMMARY = "Qt port of pavucontrol"
DESCRIPTION = "PulseAudio Volume Control (pavucontrol) is a simple volume control tool \
('mixer') for the PulseAudio sound server. In contrast to classic mixer \
tools this one allows you to control both the volume of hardware devices \
and of each playback stream separately."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "pavucontrol-qt-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "4ba7dfbb460f5eaee76dc5eee3c2188a968cff34f31e8ea5f3027efe951e54004e04e70c9b246cddc9209286dfe1e423e105ca5a960454a6d43993170bdf50d9"

RPROVIDES:${PN} += "pavucontrol-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libglib-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
