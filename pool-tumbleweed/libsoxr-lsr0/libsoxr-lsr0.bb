SUMMARY = "Compatibility layer with libsamplerate"
DESCRIPTION = "soxr libsamplerate API compatibility layer (to some extent)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libsoxr-lsr0-0.1.3-2.15.aarch64.rpm"
RPM_HASH = "3f3ecca96552325e97cb45d2c09d7822d264ceb91d577fd2b566789bbdc0dda89d294035b151cfcc7d86429f10b53dc7a160214055c530852cab0cc086e5e5ff"

RPROVIDES:${PN} += "libsoxr-lsr.so.0 \
libsoxr-lsr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsoxr.so.0"

inherit rpm
