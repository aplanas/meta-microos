SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libolecf-20221024-3.9.aarch64.rpm"
RPM_HASH = "47ef7fdb11f41799713973584447db53eead17a467669c317d9af51f85488e81b249f1b6e086153bbe7314c2509bcc2cc5724eba156df46b2bc6eacbd1d01fa1"

RPROVIDES:${PN} += "python39-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
