SUMMARY = "Pulseaudio plugin for xine"
DESCRIPTION = "libxine sound output plugin for the pulseaudio soundserver \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-pulse-1.2.13-2.3.aarch64.rpm"
RPM_HASH = "26ba468dceb5fe807bbca1058396f4004540e11aebe2af902e8a6f40387c5b8bd2a207554df6cd46abe1df681b20181269d069f0f37e89e8f12297f40bb2f529"

RPROVIDES:${PN} += "libxine2-pulse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0 \
libxine.so.2 \
libxine2"

inherit rpm
