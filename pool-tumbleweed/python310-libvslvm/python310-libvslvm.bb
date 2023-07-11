SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libvslvm-20221025-3.9.aarch64.rpm"
RPM_HASH = "91222cff81d5bf67300f79e55c9937d0277c1571d11dd96f24d4dc3eee2393a0f8d4cf934cd9351c1e9f81fd587b582448d42b9bda692eb440ef1a373c6c81a5"

RPROVIDES:${PN} += "python310-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
