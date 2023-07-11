SUMMARY = "Usrsctp Library"
DESCRIPTION = "The libraries for usersctp."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "libusrsctp2-0.9.5.0-1.10.aarch64.rpm"
RPM_HASH = "f4294a21415337532ddc94f65b3c38d3b9add8b3274022130c688d4ce6aa8b318704401c4a5323b433ea29c90b8789db4a10d1e518452e814eaf894a66b4314a"

RPROVIDES:${PN} += "libusrsctp.so.2 \
libusrsctp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
