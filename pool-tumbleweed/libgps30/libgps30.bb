SUMMARY = "Shared library for GPS applications"
DESCRIPTION = "This package provides the shared library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "libgps30-3.25-1.4.aarch64.rpm"
RPM_HASH = "8f4f31de1b144df7bdd4b1da56a01c4c2652018d477c44dee11da0b3b98e6bed1c9d36d1a471ebae6dd73555d026a42bee15ac3ad22d1646280e2e898e2a3adf"

RPROVIDES:${PN} += "libgps.so.30 \
libgps30 \
libgpsdpacket.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
