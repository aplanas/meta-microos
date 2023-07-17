SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libada13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "2ffe22155d5ec409623181ffc05024be02946c75569377835159c9a277c2bab5d2d17216fe5754eabd0754584f9e2951487f5817799d07450bbda2cf8c2fa401"

RPROVIDES:${PN} += "libada13 \
libgnarl-13 \
libgnarl-13.so \
libgnat-13 \
libgnat-13.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
