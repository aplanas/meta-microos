SUMMARY = "GSettings module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides GSettings storage of PulseAudio sound server settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-gsettings-16.1-4.1.aarch64.rpm"
RPM_HASH = "d0087a45610543bd79789a52dc9d5309175e3a615683a2633b0e147663e68f79b1182a40d201a3122ad7715951504abbad9737e71c483eace582171fcd4cb484"

RPROVIDES:${PN} += "pulseaudio-module-gsettings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
pulseaudio"

inherit rpm
