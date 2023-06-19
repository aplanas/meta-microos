SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libada13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "907dc0fd6b3a1c6ec6d821360f52df44226710532daa8942ee1a2eee8130c4111a1415fa0da34d582866bb623dd7ade57c2b9b6ea505db939256f9d864fac082"

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
