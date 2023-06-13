SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-1-1-1.20.0-3.7.aarch64.rpm"
RPM_HASH = "815668b418d0c81eb83c167654be1d37540133d55d2fbdd7d9d39dcb23e5ffaaa3433ac1c7c99478505295a39fe8027de30b49c14c8cc9e01b3d56338e28a7f8"

RPROVIDES:${PN} += "libykpers-1-1 \
libykpers-1-1(aarch-64) \
libykpers-1.so.1()(64bit) \
libykpers-1.so.1(LIBYKPERS_1.0)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.10)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.11)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.12)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.13)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.14)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.15)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.16)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.17)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.18)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.19)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.20)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.4)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.5)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.6)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.7)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.8)(64bit) \
libykpers-1.so.1(LIBYKPERS_1.9)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libusb-1.0.so.0()(64bit) \
libyubikey.so.0()(64bit) \
libyubikey.so.0(YUBIKEY_1.0)(64bit) \
libyubikey.so.0(YUBIKEY_1.5)(64bit)"

inherit rpm
