SUMMARY = "Seat management daemon"
DESCRIPTION = "Seat management takes care of mediating access to shared devices (graphics, input), without requiring the applications needing access to be root."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "seatd-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "908a5dfd8d85b17ef703f4bd4b7b2c1872df1ef6d77e256b34c174248e03d2e96ad631a4fda1d1c45b61453eb9c1f63706fae29daa079b9514640cac3d02e064"

RPROVIDES:${PN} += "seatd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseat1"

inherit rpm
