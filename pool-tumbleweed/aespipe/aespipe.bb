SUMMARY = "AES Encrypting/Decrypting Pipe"
DESCRIPTION = "aespipe program is AES encrypting or decrypting pipe. It reads from standard \
input and writes to standard output. It can be used to create and restore \
encrypted tar or cpio archives. It can be used to encrypt and decrypt loop-AES \
compatible encrypted disk images."
LICENSE = "GPL-2.0-only"

PV = "2.4f"

RPM_NAME = "aespipe-2.4f-6.3.aarch64.rpm"
RPM_HASH = "ec0e22bd7ecfcd1434b9979350555d45071155a6524dae064cfedc1f97bc7e133eb5521284a20171f8e52460528b9ce4c91439b963b842f679e76ed2766b1ad8"

RPROVIDES:${PN} += "aespipe"

RDEPENDS:${PN} += "/usr/bin/sh \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
