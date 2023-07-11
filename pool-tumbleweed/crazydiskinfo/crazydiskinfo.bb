SUMMARY = "An interactive TUI S.M.A.R.T viewer"
DESCRIPTION = "CrazyDiskInfo is an interactive TUI S.M.A.R.T viewer. \
It offers the following features: \
 \
 * An UI similar to CrystalDiskInfo. \
 * Health and temperature checking algorithms based on CrystalDiskInfo."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "crazydiskinfo-1.1.0-1.14.aarch64.rpm"
RPM_HASH = "6364b924edfb4fe1fb2b4ccb221285dfb348bcde01885ecfa82a2fd7b9ffe74260c936ec7d6cf8dcb4fa75a4a616fd7fdfc4678a178215b20037ed0634dd86ee"

RPROVIDES:${PN} += "crazydiskinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
