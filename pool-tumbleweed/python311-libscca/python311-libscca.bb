SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python311-libscca-20221027-3.10.aarch64.rpm"
RPM_HASH = "b5654634cda56e027ed5104c7e0f1f256e0bef981ce4527a076f7f1d333e7fa54c3a64efd2c6823de1732f5bace9ab65195cb5307be2c9d0abd34cb7937b72d2"

RPROVIDES:${PN} += "python3-libscca \
python311-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
