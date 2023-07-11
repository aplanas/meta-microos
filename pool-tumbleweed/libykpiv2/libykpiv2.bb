SUMMARY = "Yubikey NEO PIV applet library"
DESCRIPTION = "This is a low-level library to interact the PIV applet on a YubiKey NEO"
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykpiv2-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "c781516a0fc73f0953abdef220e6355e55cc6af4c20a5be3b0e7a6f934e0fb87bc6b9113f4370526d5656bd61fbe7ebc6bc639661973290af8cafe46ea477d39"

RPROVIDES:${PN} += "libykpiv.so.2 \
libykpiv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcsclite.so.1 \
pcsc-ccid"

inherit rpm
