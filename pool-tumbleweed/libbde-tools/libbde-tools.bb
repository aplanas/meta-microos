SUMMARY = "Tools to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "Tools to access the BitLocker Drive Encryption (BDE) format. The BDE \
format is used by Windows, as of Vista, to encrypt data on a storage \
media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221031"

RPM_NAME = "libbde-tools-20221031-3.13.aarch64.rpm"
RPM_HASH = "9246956361e711d8551a992a333c4139744aebf1d3f60a2187859da7e49f3f8c4dd9be5f4bf9273483d8ef17f448e2973f7da949fb62108adec27d39b8e20170"

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
