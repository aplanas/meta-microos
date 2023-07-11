SUMMARY = "Tools to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "Tools to access the BitLocker Drive Encryption (BDE) format. The BDE \
format is used by Windows, as of Vista, to encrypt data on a storage \
media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221031"

RPM_NAME = "libbde-tools-20221031-3.12.aarch64.rpm"
RPM_HASH = "df7fb4e7cad1a10a30bc7a0a1b36263f59c322885abe39d8a7794573d7c85761f32022194a290a3a2134d158a227b3119bf5c70ab9356dd7cbaa702a10bcbdf7"

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
