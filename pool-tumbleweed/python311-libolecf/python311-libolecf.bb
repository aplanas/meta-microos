SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libolecf-20221024-4.1.aarch64.rpm"
RPM_HASH = "46994ef6fdfa7810144ab65a5194c2d22e410bbb2882598c861492acc0576015621c536be89b543a42d2a4e5f486950963905846668374447490222e57e43bd5"

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
