SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libvslvm-20221025-5.1.aarch64.rpm"
RPM_HASH = "0b87d17c97fc49a678f8e8a3517458a9b590f269b95553ee0b718e5da144a905e996d6d8b1dfd593f6bf41b10bdadcda5756e16ae124ac40ba7f7e23c9dd690c"

RPROVIDES:${PN} += "python3-libvslvm \
python311-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
