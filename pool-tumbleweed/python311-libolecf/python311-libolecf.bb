SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libolecf-20221024-3.8.aarch64.rpm"
RPM_HASH = "b61f91a844fd63a23e8c417e94bebba1e7f73669c4a00f01d610e0f2034aa01eb7d5fd13236eb47dd6dc4fb6faf6f7690421d438c4cc193dfb60817cd11bc95f"

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
