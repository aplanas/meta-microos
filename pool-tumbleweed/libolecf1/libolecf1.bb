SUMMARY = "Library to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf1-20221024-3.5.aarch64.rpm"
RPM_HASH = "52441e92c672b7cd9cad2f1eaced1aa0650993dadb84051c0d6c1ee186d25577e2bf9eea4739225857b715b495cf81d42faaf60798bd94da2c5e878d9da8f4a7"

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
