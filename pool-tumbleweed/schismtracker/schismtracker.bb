SUMMARY = "Music editor that matches the look and feel of Impulse Tracker"
DESCRIPTION = "Schism Tracker is a reimplementation of Impulse Tracker, a \
program used to create music without the requirements of \
specialized, expensive equipment, and with a unique 'finger feel' \
that is difficult to replicate in-part. The player is based on a \
modified version of the Modplug engine, with a number of \
bugfixes and changes to improve IT playback."
LICENSE = "GPL-2.0-or-later"

PV = "20221201"

RPM_NAME = "schismtracker-20221201-1.4.aarch64.rpm"
RPM_HASH = "2cd0d9021a7914c8ac48c70fa8af1e63e1b7b7ae2d5de6628f8b0946e7bd7b46dec9d209ce5b787931a651adc12ac2d53ec37c86f9fa501c80d0c46d14c7b29b"

RPROVIDES:${PN} += "schismtracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXv.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
