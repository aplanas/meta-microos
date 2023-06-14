SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python310-libvsmbr-20210509-4.7.aarch64.rpm"
RPM_HASH = "ce1ec634f27b839898f49e978b0257b116538c4ec7434673cb25518a5d8787dd13bd166208346c6d7e12fc3bef8c328c5f65d9b51c2f7fc1ac0087f8232e7c93"

RPROVIDES:${PN} += "python3-libvsmbr \
python310-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
