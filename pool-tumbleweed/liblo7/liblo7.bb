SUMMARY = "Open Sound Control implementation"
DESCRIPTION = "This is an implementation of the OSC protocol \
(see http://www.cnmat.berkeley.edu/OpenSoundControl/ for details)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.31"

RPM_NAME = "liblo7-0.31-1.12.aarch64.rpm"
RPM_HASH = "6936f77e576ef1fc086507a7b6f80525ad45f32a68b0fec6c8e632614541e708625459e14cff9e28fb67c01ddb94c4161113961fe7b9810b12837812b8dd5a25"

RPROVIDES:${PN} += "liblo.so.7 \
liblo7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
