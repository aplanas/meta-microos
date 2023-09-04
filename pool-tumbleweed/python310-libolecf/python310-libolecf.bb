SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libolecf-20221024-4.1.aarch64.rpm"
RPM_HASH = "9447a2411358feeffa9d572aa6811ea7959c194051b12aea0c63b11f3d45530b759d51a84323e46b5d0458b73235b54317f79909e96a95f94bc10050b29b162e"

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
