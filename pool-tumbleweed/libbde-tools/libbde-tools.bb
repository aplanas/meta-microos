SUMMARY = "Tools to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "Tools to access the BitLocker Drive Encryption (BDE) format. The BDE \
format is used by Windows, as of Vista, to encrypt data on a storage \
media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221031"

RPM_NAME = "libbde-tools-20221031-4.1.aarch64.rpm"
RPM_HASH = "a6a60bea301b3324e75e1a96914fba57caed062af4a5a591c8c72c4637a00a2fab2b1cbae4e3d85a6f1797f57bbda1f9b016caba5c001baf18077aec8b82e43d"

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
