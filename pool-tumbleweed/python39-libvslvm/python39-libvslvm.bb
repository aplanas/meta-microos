SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libvslvm-20221025-3.9.aarch64.rpm"
RPM_HASH = "bf06987a917a69b9dd63150400481e93ab212dbe253e39ee6900e5a76208d1aca673a2835ee35c8c33274e62361d676de618156c2d3fad625a5d9449cc14f864"

RPROVIDES:${PN} += "python39-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
