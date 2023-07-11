SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libolecf-20221024-3.8.aarch64.rpm"
RPM_HASH = "e1215b176e7dad2df118e8b4b2f70a4d55a16c1736e6153d62ebdc92277b808cd7eedaf0563866eada0e31fe77cbd0fc826df06076c630be1bc64b377b844327"

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
