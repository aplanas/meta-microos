SUMMARY = "LIRC module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides support for IR and RF remotes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-lirc-16.1-4.1.aarch64.rpm"
RPM_HASH = "8e8f5a533abbbc198c7ebcc7c85a8e7df63ad97036d2928539db0127d9d6076186213fd4737eee7e7a513c4ee0a18cf8914ea421249e8baa2aa2dd47f1290498"

RPROVIDES:${PN} += "pulseaudio-module-lirc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc-client.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
pulseaudio"

inherit rpm
