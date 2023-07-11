SUMMARY = "PulseAudio utilities"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides utilies for making use of the PulseAudio sound \
server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-utils-16.1-4.1.aarch64.rpm"
RPM_HASH = "476acc65fb45354308545d08483006210cde058a4f6c9975601b3315ad0578e30e87444689e9a50576d954f9c593e8d957cd8ef2a3ebf2a9c4ce97c1335d312f"

RPROVIDES:${PN} += "libpulsedsp.so \
pulseaudio-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse-mainloop-glib0 \
libpulse.so.0 \
libpulse0 \
libpulsecommon-16.1.so \
libsndfile.so.1 \
libxcb.so.1 \
pulseaudio-daemon"

inherit rpm
