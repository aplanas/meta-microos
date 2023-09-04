SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libolecf-20221024-4.1.aarch64.rpm"
RPM_HASH = "071cb93cc3b1e1d6c6f2a6c83fa435ac9131f9d09c12cbe15e84f879c8262e893d558aea284d3d4eea065ae08815b19efbdc7eb9f3a7190451be5407cb55d602"

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
