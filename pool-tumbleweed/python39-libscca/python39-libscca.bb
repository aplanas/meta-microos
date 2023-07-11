SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python39-libscca-20221027-3.10.aarch64.rpm"
RPM_HASH = "33c9b53da0091dce11ad95a7c8f951f1e57f1a4f5743bbb5ccc0c74e25c5ed0baca2cb7ddc8897bb323120e2db6cdc9bb678eae3d8403bf4e501435e906dfc98"

RPROVIDES:${PN} += "python39-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
