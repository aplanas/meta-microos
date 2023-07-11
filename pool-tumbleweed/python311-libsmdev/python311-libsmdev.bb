SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python311-libsmdev-20221028-2.11.aarch64.rpm"
RPM_HASH = "be7a711495f421233abbb4c97af560813340741e3d6f4c2baba9c1ef291ccb334cd718abca7c758a9926d8c332d5fe5b9463fd525cc04770f0cd29b27f7b38c5"

RPROVIDES:${PN} += "python3-libsmdev \
python311-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
