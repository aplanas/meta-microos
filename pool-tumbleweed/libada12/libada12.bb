SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libada12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "0dc94f61f1c020be27e08d2f09d1d308fd3bb9c0b51d85c52c0c312f9ca334d35a3bae414e597100128cbcea2fa3fb82eb419b49d6f35e17fbad439c87bf5cd9"

RPROVIDES:${PN} += "libada12 \
libgnarl-12 \
libgnarl-12.so \
libgnat-12 \
libgnat-12.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
