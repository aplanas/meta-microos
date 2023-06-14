SUMMARY = "X11 authorization protocol library"
DESCRIPTION = "libXau provides mechanisms for individual access to an X Window \
System display. It uses existing core protocol and library hooks for \
specifying authorization data in the connection setup block to \
restrict use of the display to only those clients that show that they \
know a server-specific key called a 'magic cookie'."
LICENSE = "MIT"

PV = "1.0.11"

RPM_NAME = "libXau6-1.0.11-1.2.aarch64.rpm"
RPM_HASH = "4426d56b3bbc6e48749d19d8264223e1825a097520e5c7056ba2bddb7f38158c51a9fbeefe5cc4fe1772deee5e30cfcf979c604f317ccbde2c2f7f33790da1d2"

RPROVIDES:${PN} += "libXau.so.6 \
libXau6 \
xorg-x11-libXau"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
