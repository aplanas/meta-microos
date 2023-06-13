SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libolecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "4dff3a577ee17eb635efea9b8d53d0ab633941cb1d5e0218d63e5674ab57be148c0b4498147f3ac654d94810a7f9e9523f37c9aa8dbe09c5bda15d4e294f256c"

RPROVIDES:${PN} += "python3-libolecf \
python310-libolecf \
python310-libolecf(aarch-64)"

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
