SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-1-1-1.20.0-3.7.aarch64.rpm"
RPM_HASH = "815668b418d0c81eb83c167654be1d37540133d55d2fbdd7d9d39dcb23e5ffaaa3433ac1c7c99478505295a39fe8027de30b49c14c8cc9e01b3d56338e28a7f8"

RPROVIDES:${PN} += "libykpers-1-1 \
libykpers-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libusb-1.0.so.0 \
libyubikey.so.0"

inherit rpm
