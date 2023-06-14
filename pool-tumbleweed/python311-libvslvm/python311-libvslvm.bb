SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libvslvm-20221025-3.7.aarch64.rpm"
RPM_HASH = "6f5084fb3cc520003205b1404b84f137b680abe672ba46c774a51d64aa43ac6c03776eafbbf7d4b3d875cac2ae761d1a7ea35acb403cbe1342f896921e34116f"

RPROVIDES:${PN} += "python311-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
