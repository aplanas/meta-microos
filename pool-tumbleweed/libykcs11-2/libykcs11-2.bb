SUMMARY = "Yubikey NEO PKCS#11 applet library"
DESCRIPTION = "This is a PKCS#11 module that allows to communicate with the PIV application running on a YubiKey"
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykcs11-2-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "0580d0bfd0ebc05e52775fff8ea0a3347905f0e8e78e4c043a105555f2f7897bca15f31da991b1dbb3528b4674c19dd6f97f98e712a62a41dc927ba5f4fc0cf3"

RPROVIDES:${PN} += "libykcs11-2 \
libykcs11-2(aarch-64) \
libykcs11.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libykpiv.so.2()(64bit) \
pcsc-ccid"

inherit rpm
