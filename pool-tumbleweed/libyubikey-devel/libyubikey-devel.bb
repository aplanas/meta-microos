SUMMARY = "Yubico's USB key low-level C library"
DESCRIPTION = "Low-level library for decrypting and parsing Yubikey One-Time Passwords \
(OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey-devel-1.13-3.24.aarch64.rpm"
RPM_HASH = "43a6910ca4353e4e47bdb83a34621572cd91c045679fc7373fda8eba02e054a9b0351a84d49c58da818b9762dcb338348b953196c28b9fdc79ee94d75133a543"

RPROVIDES:${PN} += "libyubikey-devel"

RDEPENDS:${PN} += "glibc-devel \
libyubikey0"

inherit rpm
