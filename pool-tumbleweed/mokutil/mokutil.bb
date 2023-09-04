SUMMARY = "Tools for manipulating machine owner keys"
DESCRIPTION = "This program provides the means to enroll and erase the machine owner \
keys (MOK) stored in the database of shim."
LICENSE = "GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "mokutil-0.6.0-2.1.aarch64.rpm"
RPM_HASH = "79d7906ea5bb92e1518aa14c2559671a0ed5611de96803d10fa4f294c1b7c531736f9755358d1266e5f0d6071f115e270fc9da905374b7fbecc6188dadfd76a5"

RPROVIDES:${PN} += "mokutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libefivar.so.1 \
libkeyutils.so.1 \
openssl"

inherit rpm
