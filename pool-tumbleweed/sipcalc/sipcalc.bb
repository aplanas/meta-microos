SUMMARY = "Console based ip subnet calculator with IPv4 and IPv6 support"
DESCRIPTION = "Sipcalc is an console based ip subnet calculator with IPv4 and IPv6 support."
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "sipcalc-1.1.6-2.24.aarch64.rpm"
RPM_HASH = "afd8ddea1d1856243b539cbb9e10177f4bd14cdd506873d97e28894903d4c9b11b34627bba37b38f6a6ebbceba2c3d8004cb0ffca1ebc5c6963b0b2dca1fae40"

RPROVIDES:${PN} += "sipcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
