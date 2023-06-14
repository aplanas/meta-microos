SUMMARY = "Open Sound Control implementation"
DESCRIPTION = "This is an implementation of the OSC protocol \
(see http://www.cnmat.berkeley.edu/OpenSoundControl/ for details)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.31"

RPM_NAME = "liblo7-0.31-1.11.aarch64.rpm"
RPM_HASH = "97bac2ed1e85b6b889a16b1bcc83806063f9a47a8c55653ce67256c6e590333e149ed9c8ace38250576ad18f5507417d82ae314f7f236633a9cf3d932a6631b9"

RPROVIDES:${PN} += "liblo.so.7 \
liblo7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
