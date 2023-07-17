SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python310-libsmdev-20221028-2.12.aarch64.rpm"
RPM_HASH = "37e30cb9fd94e2e4ed3d833e0905cbaf5f57f35ad56c28a416993426138e5072fb2724609a6f20b7646236734a60d45325f5fc7c2efc18daa9d591e883189ae2"

RPROVIDES:${PN} += "python310-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
