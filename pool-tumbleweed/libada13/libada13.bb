SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libada13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "aa0040d5726d1f752c6a38e4fd19865c5c8b6f7ab71bba73666e7a735bcffbc25cd478db1946e0149932c5e24f3363a2ec4ed1a5a0839b4ff8010110ef459ccc"

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
