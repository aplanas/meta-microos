SUMMARY = "Music editor that matches the look and feel of Impulse Tracker"
DESCRIPTION = "Schism Tracker is a reimplementation of Impulse Tracker, a \
program used to create music without the requirements of \
specialized, expensive equipment, and with a unique 'finger feel' \
that is difficult to replicate in-part. The player is based on a \
modified version of the Modplug engine, with a number of \
bugfixes and changes to improve IT playback."
LICENSE = "GPL-2.0-or-later"

PV = "20230906"

RPM_NAME = "schismtracker-20230906-1.1.aarch64.rpm"
RPM_HASH = "eca9aecced0da6ce36be0b4d0491295042d8ecb869dd142cca9edd61e31f7d1ee65a7a822998fc9ed59932dd994e3513b35710bc0adac748238967086a36afd7"

RPROVIDES:${PN} += "schismtracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXv.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
