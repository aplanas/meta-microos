SUMMARY = "Yubico's USB key low-level C library"
DESCRIPTION = "Low-level library for decrypting and parsing Yubikey One-Time Passwords \
(OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey0-1.13-3.24.aarch64.rpm"
RPM_HASH = "d2cb462ecd882eaa97c7cb54e42d19a0aa125f29df6b73e9f64dc050ce0620301b7b3c78b95e5bd07518e402d92d5f1a60963d5aff208866d3cbbe3bda200874"

RPROVIDES:${PN} += "libyubikey.so.0 \
libyubikey0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
