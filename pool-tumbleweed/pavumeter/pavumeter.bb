SUMMARY = "PulseAudio Volume Meter"
DESCRIPTION = "PulseAudio Volume Meter (pavumeter) is a simple GTK volume meter for \
the PulseAudio sound server."
LICENSE = "GPL-2.0+"

PV = "0.9.3"

RPM_NAME = "pavumeter-0.9.3-195.30.aarch64.rpm"
RPM_HASH = "be901ca359150fa70522de93cb3a2edcd3596c569a17b49ad4b879fef38bc4cba25f7528a353f8b02459812986fd8d998e6032be2d356c697d175d4630156c13"

RPROVIDES:${PN} += "pavumeter"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-x11-2.0.so.0 \
libgtkmm-2.4.so.1 \
libm.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
