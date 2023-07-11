SUMMARY = "Library to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf1-20221024-3.8.aarch64.rpm"
RPM_HASH = "b1c3fe6ce1a997b10425ed93cab2ea3882fe58febf1327ad2658f4d40083d3803e358c2d507bb9b59b05df3feed3b3b5290138b30028c42ee51fbc26b61c457b"

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
