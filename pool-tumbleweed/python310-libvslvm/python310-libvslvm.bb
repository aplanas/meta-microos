SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libvslvm-20221025-4.1.aarch64.rpm"
RPM_HASH = "93d7f165fbfbc62fb5e8ccece7022e419f5a5a4732132d793cb963e41d3d84c88689e1becaf7f1f837538a123b8b306edd59fd71e33cb74db849e7c72dff854b"

RPROVIDES:${PN} += "python310-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
