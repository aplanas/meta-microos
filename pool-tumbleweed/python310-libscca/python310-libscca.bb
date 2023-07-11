SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python310-libscca-20221027-3.10.aarch64.rpm"
RPM_HASH = "ecf981878a0d244992805b3d05f7a9c515e8628f08aea16358211340256d23045f5d96f00c0bc20f07c30cb3143036beff90ef8b1e339bdf13972997a51b88ca"

RPROVIDES:${PN} += "python310-libscca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libscca.so.1 \
python-abi"

inherit rpm
