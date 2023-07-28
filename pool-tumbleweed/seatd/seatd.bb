SUMMARY = "Seat management daemon"
DESCRIPTION = "Seat management takes care of mediating access to shared devices (graphics, input), without requiring the applications needing access to be root."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "seatd-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "aa4c465e063a850c1be543ef59e6c6285beca7bcc03ff09eec59b7c6d3cdd744c5fc248582ec6a4e0d050f96ce8109b7ae62ca6b5dcd28d3ffae51c08d63371c"

RPROVIDES:${PN} += "seatd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseat1"

inherit rpm
