SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python310-libscca-20230716-2.1.aarch64.rpm"
RPM_HASH = "031d64d137336ddb29c0bb8c9a2d0304213bc29b248f34ac2cdca917ec04ae7d6c0a1747bcadd1702d5f16dd986063bed2501476173ba73313ecbab440407051"

RPROVIDES:${PN} += "python310-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
