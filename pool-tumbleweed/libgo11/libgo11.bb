SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "7.5.0+r278197"

RPM_NAME = "libgo11-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "295367994d6ac90e2215193a2eb10c6e7acc578577844270b5feb30e927fcb6989052299c2a40ebc663d17d22f4abab89bf02eddeb2ea64a4a5edfdf798e5b8b"

RPROVIDES:${PN} += "libgo.so.11 \
libgo11"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
