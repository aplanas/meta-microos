SUMMARY = "Tools to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "Tools to access the BitLocker Drive Encryption (BDE) format. The BDE \
format is used by Windows, as of Vista, to encrypt data on a storage \
media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221031"

RPM_NAME = "libbde-tools-20221031-3.9.aarch64.rpm"
RPM_HASH = "0bfb953eb3a7d5e0a170f7bdf174c4648e8c055bbc58810b02a65c0c3d3bef41581f0ccf9b4cc27a07c129f87f6ee48fa22b88d7e8d7b8098f8ad96a119af669"

RPROVIDES:${PN} += "libbde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfuse.so.2 \
libuna.so.1"

inherit rpm
