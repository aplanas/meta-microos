SUMMARY = "Yubikey NEO PKCS#11 applet library"
DESCRIPTION = "This is a PKCS#11 module that allows to communicate with the PIV application running on a YubiKey"
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykcs11-2-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "7fd09d19ff94ec2a6971130109fb5b10715ebd82f02da4e9d2c35a80ef0efb7778ed8e59f7d4af43f0b25f32e8a21e2a4c94d8ed1ba952043a780fb1efbdab66"

RPROVIDES:${PN} += "libykcs11-2 \
libykcs11.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libykpiv.so.2 \
pcsc-ccid"

inherit rpm
