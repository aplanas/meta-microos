SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python310-libscca-20221027-3.11.aarch64.rpm"
RPM_HASH = "2d08fc7c19f19ab4b7ac9271a45f3b890f1b87f3016f3f5d3073d037a4bb5e129fd424350de33b4ca3d3d1b15a6f669d79981ecc4d5c1c85494c4a6a558ae497"

RPROVIDES:${PN} += "python310-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
