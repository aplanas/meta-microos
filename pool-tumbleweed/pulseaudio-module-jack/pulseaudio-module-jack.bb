SUMMARY = "JACK support for the PulseAudio sound server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package includes support for Jack-based applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-jack-16.1-3.1.aarch64.rpm"
RPM_HASH = "94fcf957e1d50c9703d48b18756445ce4495352be5d75ec771a6c197c72eea2614e81bacde794bcc30ad0bdd0853d58203945f92c5cd88c90514428d8fc78693"

RPROVIDES:${PN} += "pulseaudio-module-jack \
pulseaudio-module-jack(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libjack.so.0()(64bit) \
libpulsecommon-16.1.so()(64bit) \
libpulsecore-16.1.so()(64bit) \
pulseaudio"

inherit rpm
