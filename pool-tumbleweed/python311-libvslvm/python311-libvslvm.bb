SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libvslvm-20221025-3.9.aarch64.rpm"
RPM_HASH = "2842f88c483a9aa2d10cecf8beedf619bf5009d3024faec89d17cedb73ee7e643cb53ea60652074ae34dc5c6e117e50fd3fa10570801680a29b2e5bd2c90a831"

RPROVIDES:${PN} += "python3-libvslvm \
python311-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
