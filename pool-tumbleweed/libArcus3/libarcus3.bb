SUMMARY = "3D printer control software"
DESCRIPTION = "Communication library between internal components for Ultimaker software"
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus3-4.13.1-4.1.aarch64.rpm"
RPM_HASH = "0c2601d19aa032b01f583627fa36d0c63523e53c55a7013ec835849d66d9cb0cfef78fcef2f1d9f6f913b0f1ba14c630e1f3a3931909155936c8bd4672b74866"

RPROVIDES:${PN} += "libArcus-Ultimaker \
libArcus.so.3 \
libArcus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.3.0 \
libstdc++.so.6"

inherit rpm
