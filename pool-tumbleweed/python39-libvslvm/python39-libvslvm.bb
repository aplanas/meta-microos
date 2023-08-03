SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libvslvm-20221025-4.1.aarch64.rpm"
RPM_HASH = "83840cd9836ea21eee0cff431ecc03f8f8e90a0e06be054425fd9d9dcf5ed4afa122a28a6e51c8935313590e6e50c704da6bfaaa5e6b7eb811ba9bccd654fe72"

RPROVIDES:${PN} += "python39-libvslvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvslvm.so.1 \
python-abi"

inherit rpm
