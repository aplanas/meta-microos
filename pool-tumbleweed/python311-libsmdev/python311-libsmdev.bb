SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python311-libsmdev-20221028-3.1.aarch64.rpm"
RPM_HASH = "7912f810f6138dbabe07170f8f8e3f08496afdb6c8d081ecce0b93180866d0c986c83bfb80eb76211a2ac3a44af5227a8e0fcde7398d0301391722c74d8344cd"

RPROVIDES:${PN} += "python3-libsmdev \
python311-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
