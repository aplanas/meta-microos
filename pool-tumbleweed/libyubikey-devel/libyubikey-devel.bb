SUMMARY = "Yubico's USB key low-level C library"
DESCRIPTION = "Low-level library for decrypting and parsing Yubikey One-Time Passwords \
(OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey-devel-1.13-3.23.aarch64.rpm"
RPM_HASH = "c0ee733d08968a10d40857fe934ddb186b96ab3b977e1dff397c7a46ba87e9a5add021cca53c9576a541732ff39a594b6c12bb48a55e1ed82b1da385c055cdc5"

RPROVIDES:${PN} += "libyubikey-devel \
libyubikey-devel(aarch-64)"

RDEPENDS:${PN} += "glibc-devel \
libyubikey0"

inherit rpm
