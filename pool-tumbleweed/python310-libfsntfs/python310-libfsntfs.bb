SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python310-libfsntfs-20230606-1.4.aarch64.rpm"
RPM_HASH = "4eda2f5fca9fd03e0bd5c8e2f4d742586f6a6c2718a3a1def806d5c57f3197648cd3b36b7cf1596e77ae8eff64bc2c7fc8f124b9f64b52e889e65b2b8d39e955"

RPROVIDES:${PN} += "python310-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
