SUMMARY = "AES Encrypting/Decrypting Pipe"
DESCRIPTION = "aespipe program is AES encrypting or decrypting pipe. It reads from standard \
input and writes to standard output. It can be used to create and restore \
encrypted tar or cpio archives. It can be used to encrypt and decrypt loop-AES \
compatible encrypted disk images."
LICENSE = "GPL-2.0-only"

PV = "2.4f"

RPM_NAME = "aespipe-2.4f-6.2.aarch64.rpm"
RPM_HASH = "93dd9acaabc5fb26a79269dd1176da1be4bb73b986263f34bb5a51f732be37e6f3ae06f7aa2fe1f19099bc918401d0a860400bc25c4238927fc2fb1d4c1ac195"

RPROVIDES:${PN} += "aespipe \
aespipe(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gpg2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
