SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libvslvm-20221025-5.1.aarch64.rpm"
RPM_HASH = "6f7ae7f78f3a34d77789c11048971744e824522b77d62665f36728d69b66b1be6b5cc874991f2533401161cc55285b04fc7a328524fd73992b721cfa2174a84c"

RPROVIDES:${PN} += "python39-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
