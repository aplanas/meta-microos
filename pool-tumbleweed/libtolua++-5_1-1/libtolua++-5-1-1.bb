SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_1-1-1.0.93-10.4.aarch64.rpm"
RPM_HASH = "64f35f6e50f5e0f53da0890fb97be14fcb6d2463629b9f4d3684f33570bb42484cc0966e86ea80f703e85958e47b8a1adde8bd67add94837ea1b8fdc5d77ce32"

RPROVIDES:${PN} += "libtolua++-5-1-1 \
libtolua++-5.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libm.so.6"

inherit rpm
