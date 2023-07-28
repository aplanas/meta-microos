SUMMARY = "Development files for seatd"
DESCRIPTION = "Development files for seatd."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "seatd-devel-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "0a501d0255f7f2ae1bdb1f365c1e8a93faf1f10517588abe39adf7e776c00e06bcf593ef369785dc52ae3e1d20d7dfd42cf5df39c0684b0271b6dacd6cf66273"

RPROVIDES:${PN} += "pkgconfig-libseat \
seatd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseat1 \
pkgconfig-libsystemd"

inherit rpm
