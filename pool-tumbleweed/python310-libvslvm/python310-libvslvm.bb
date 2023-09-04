SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libvslvm-20221025-5.1.aarch64.rpm"
RPM_HASH = "34f76a2b448eb1bcd9b3e5fd8af45097813e6b74bf6e3ba5d6b7718de6a9f1702707875e35790235c19eb456eb5f36511d91fb76191b3492c3fbc027d225ec5c"

RPROVIDES:${PN} += "python310-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
