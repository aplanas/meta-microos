SUMMARY = "Yubikey NEO PIV applet library"
DESCRIPTION = "This is a low-level library to interact the PIV applet on a YubiKey NEO"
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykpiv2-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "c1dccd20b33efc4c64a3c32bc9977fa55dcf3b45821e24131c5e163bafe7e9c88fd36d6740e2eeb3359c7dbc56e23b239333705daf8d2f62d1ab31aa7262800b"

RPROVIDES:${PN} += "libykpiv.so.2 \
libykpiv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcsclite.so.1 \
pcsc-ccid"

inherit rpm
