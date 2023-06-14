SUMMARY = "Library for parlatype"
DESCRIPTION = "Parlatype ships its own library, libparlatype, which provides a GStreamer backend (PtPlayer) and a waveviewer widget (PtWaveviewer) which is a GtkWidget."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "libparlatype5-3.1-1.7.aarch64.rpm"
RPM_HASH = "abce5989cdf65b3aa040ad99e4134ffe8b23f1a40e8e729e31fede4128f35bb11e614930caf19672a93b0175624662d4793079e61c450d7217eb75af07adb4c8"

RPROVIDES:${PN} += "libparlatype.so.5 \
libparlatype5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
