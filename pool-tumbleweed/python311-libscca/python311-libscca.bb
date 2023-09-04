SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python311-libscca-20230716-2.1.aarch64.rpm"
RPM_HASH = "0049664101627cab1e2e4d3dd07de132492e7675898968fc3b5e8ccde29d02174b147991d52bc3a304dc83b1d6e39b5ead733053c36662c027c9144bf411ef55"

RPROVIDES:${PN} += "python3-libscca \
python311-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
