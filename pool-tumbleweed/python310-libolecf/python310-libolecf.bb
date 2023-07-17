SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libolecf-20221024-3.9.aarch64.rpm"
RPM_HASH = "812628d5f357cdf0fa4b9c5d3139374a27c2c8d57d9ca3b02fe87a6977203ca241b5f5be0ed44f0a1c45ce1b5c85c4830707eae341ad6ac3199c5034a7b6a521"

RPROVIDES:${PN} += "python310-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
