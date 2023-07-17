SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python39-libfsntfs-20230606-1.5.aarch64.rpm"
RPM_HASH = "bdaf38ef7872add3b0fa56544c508213a0750dae8d1e4a23a713b60db2fa7a4c6d493dfda2fc8d243f9d4b137bcc68642265be73a85b12703d1ef04403401bdf"

RPROVIDES:${PN} += "python39-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
