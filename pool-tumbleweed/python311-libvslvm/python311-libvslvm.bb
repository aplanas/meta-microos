SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libvslvm-20221025-4.1.aarch64.rpm"
RPM_HASH = "d52a2f851253f30a2025180b10afd2fb4567e5417299ec9a252e0659228e5820a22be60ffee6191b5120e16c52289cf5392dd65211e28780421ff3eef88a1ab2"

RPROVIDES:${PN} += "python3-libvslvm \
python311-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
