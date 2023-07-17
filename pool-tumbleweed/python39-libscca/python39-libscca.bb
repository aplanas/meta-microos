SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python39-libscca-20221027-3.11.aarch64.rpm"
RPM_HASH = "b9e925fdb8c48753c40661f13a47ecbea820a4b4f4e559f52432d8d7072c127033be7448c6d8f252e8d67392b3fa49c326737fe56b633560d81bfe86c62a02dd"

RPROVIDES:${PN} += "python39-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
