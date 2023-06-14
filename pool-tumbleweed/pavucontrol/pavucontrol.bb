SUMMARY = "PulseAudio Volume Control"
DESCRIPTION = "PulseAudio Volume Control (pavucontrol) is a simple GTK based volume \
control tool ('mixer') for the PulseAudio sound server. In contrast to \
classic mixer tools this one allows you to control both the volume of \
hardware devices and of each playback stream separately."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "pavucontrol-5.0-1.9.aarch64.rpm"
RPM_HASH = "969821875c6c06fd4f1ddc324110f786b37f71f2dd2e1367ccfbcd7e54003fa27ffa5686ae3554b12873bb4bc4d5e658c7571e87bdd1f3b2ce40ad3fc6e6dd57"

RPROVIDES:${PN} += "pavucontrol"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libjson-glib-1.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
pulseaudio-daemon"

inherit rpm
