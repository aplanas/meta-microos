SUMMARY = "Tools to support Yubico's USB key low-level C library"
DESCRIPTION = "Binary tools to support Yubico's Low-level library for decrypting and \
parsing Yubikey One-Time Passwords (OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey-tools-1.13-3.24.aarch64.rpm"
RPM_HASH = "a1d026d21b0a524d872719776380393501f89257dc6176cef34342b1891e05c12ba9251101d78d615221116f975344532d83c65db70fc7e8202d5f9dd9b1c956"

RPROVIDES:${PN} += "libyubikey-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyubikey.so.0"

inherit rpm
