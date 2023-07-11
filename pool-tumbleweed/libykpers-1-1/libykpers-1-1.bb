SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-1-1-1.20.0-3.8.aarch64.rpm"
RPM_HASH = "0d553184b40c069a88fcd1dcec13af507b2e3628a3ff16bc679b5c0047b066ef6722598037c138f5d32860194dc5b52f0aa4577b285e0eecb266ad4a29366d2d"

RPROVIDES:${PN} += "libykpers-1-1 \
libykpers-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libusb-1.0.so.0 \
libyubikey.so.0"

inherit rpm
