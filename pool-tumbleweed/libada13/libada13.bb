SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libada13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "6c1d82380cfc807332606c6f3d00304ef8334c6faf1238152c4f45f40a4d9ff16b89860a7e6c04f8eec53b3116f7c3b25aa0f46d0c447efc96d668ddf43ec80b"

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
