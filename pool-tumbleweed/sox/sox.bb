SUMMARY = "Sound Conversion Tools"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "sox-14.4.2-7.1.aarch64.rpm"
RPM_HASH = "ebea882fcba99a0ebb7a5b8ae084f069920f840693c28e0e9bc291418ea5945bd7cf3d5a949e140bec55235d4841e73c04356c547dee6392c51162d1cb73ae00"

RPROVIDES:${PN} += "sox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsox.so.3"

inherit rpm
