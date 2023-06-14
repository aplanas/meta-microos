SUMMARY = "Yubico's USB key low-level C library"
DESCRIPTION = "Low-level library for decrypting and parsing Yubikey One-Time Passwords \
(OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey0-1.13-3.23.aarch64.rpm"
RPM_HASH = "52dfda392fc99d83ba43fae4c2caf4957cc345a65d393c8dc3a7caf070c3d707d36aaed65ee649cfc85f3e256b25cf042f03fe8bf19b71db667b97c1bbdf653a"

RPROVIDES:${PN} += "libyubikey.so.0 \
libyubikey0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
