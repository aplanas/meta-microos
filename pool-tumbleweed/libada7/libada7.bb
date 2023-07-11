SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libada7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "7a09dfc823ab02d05dc2a53b695ab175c476fa521fe88d0dc62a9965de973d2b2d9a05c12232a5749f9080f4f418d1d7a335ca91ea119fc8da5ebb73076e18eb"

RPROVIDES:${PN} += "libada7 \
libgnarl-7 \
libgnarl-7.so \
libgnat-7 \
libgnat-7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
