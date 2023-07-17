SUMMARY = "Library to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf1-20221024-3.9.aarch64.rpm"
RPM_HASH = "d56a3308e46601f6970762bf6075680ec5d92aca2adf729acd43fbcb30e37c0d8a0fe79cf8d8b01928d57e6a63f53a6bb1df5f42f929c1896623ebecbeb6fcd2"

RPROVIDES:${PN} += "libolecf.so.1 \
libolecf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
