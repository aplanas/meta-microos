SUMMARY = "Library to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library to access the OLE 2 Compound File (OLECF) format. The OLE 2 \
Compound File format is used to store certain versions of Microsoft \
Office files, thumbs.db and other file formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libolecf1-20221024-4.1.aarch64.rpm"
RPM_HASH = "79f7cce46e5dd35e52ae69687f29bb73b03abf347bbd4e3aa4ee09863a3b8e2c2c5638af4afc7be5a404bccf6d2b81b190513791bf70b250e17bbbbe22523fdc"

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
