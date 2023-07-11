SUMMARY = "Library files for libenet"
DESCRIPTION = "The libenet7 package contains libraries for libenet."
LICENSE = "MIT"

PV = "1.3.17"

RPM_NAME = "libenet7-1.3.17-1.11.aarch64.rpm"
RPM_HASH = "a21560eaa260d4bd50a73a1dd0b90b3cd50a38d4bd61483676e9605b8575a33271e2432baea91d69f9942b4faa9c94b68b3a616914efbc31af64f8630d3b8ecf"

RPROVIDES:${PN} += "libenet.so.7 \
libenet7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
