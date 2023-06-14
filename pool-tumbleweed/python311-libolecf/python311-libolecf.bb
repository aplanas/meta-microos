SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libolecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "2b049b149ff91e9731e039adbf7f19b1d78fd1ce0f8e15dad93e454d5e75bb135b6661121818fc1f24c272a096aeb18648d05299e04b74e62abf93fbb99ad74c"

RPROVIDES:${PN} += "python311-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
