SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python311-libscca-20221027-3.11.aarch64.rpm"
RPM_HASH = "c2438a02fbb980446f973418d4e9b9ef035cfd4002f8f6d88565db44de7af70c06b0e63d96eb4aa1f390e0da15cf6be1da1d89cc8307016dda52e1b0e5892290"

RPROVIDES:${PN} += "python3-libscca \
python311-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
