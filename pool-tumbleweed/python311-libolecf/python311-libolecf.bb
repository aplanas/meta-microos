SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libolecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "2b049b149ff91e9731e039adbf7f19b1d78fd1ce0f8e15dad93e454d5e75bb135b6661121818fc1f24c272a096aeb18648d05299e04b74e62abf93fbb99ad74c"

RPROVIDES:${PN} += "python311-libolecf \
python311-libolecf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libolecf.so.1()(64bit) \
libolecf.so.1(V_20221024)(64bit) \
python(abi)"

inherit rpm
