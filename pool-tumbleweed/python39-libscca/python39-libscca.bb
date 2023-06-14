SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python39-libscca-20221027-3.7.aarch64.rpm"
RPM_HASH = "ff51005e353f7a21b8a5c99df31cbe11ec1da3ce0de4131f4eb0986de0defb089127926a9e362c4c5816a687616839f56558da4d190d6eba370bfc2019ff504b"

RPROVIDES:${PN} += "python39-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
