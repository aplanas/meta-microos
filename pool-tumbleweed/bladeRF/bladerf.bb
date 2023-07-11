SUMMARY = "SDR radio receiver"
DESCRIPTION = "The software for bladeRF USB 3.0 Superspeed Software Defined Radio."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2023.02"

RPM_NAME = "bladeRF-2023.02-16.4.aarch64.rpm"
RPM_HASH = "420ca0b7c5275b135b9f1e649816f697ba992a7bde95c568754897643287b6b547f2e9146efc114f6dee7fd150d15c63c55fce1e789d6e1f689c99cb785ae092"

RPROVIDES:${PN} += "bladeRF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbladeRF.so.2 \
libc.so.6 \
libm.so.6 \
libtecla-r.so.1"

inherit rpm
