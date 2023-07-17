SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libolecf-20221024-3.9.aarch64.rpm"
RPM_HASH = "5a26b6cf73a75846fff2ed9f98c21268fdb67c2d90216dcbb8b2abd0517da2bd1af84be897983c707b19c6161eb95372fd6803459c6d3dc861172613646eb5c6"

RPROVIDES:${PN} += "python3-libolecf \
python311-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
