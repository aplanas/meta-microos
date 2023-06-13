SUMMARY = "Mediated device management and persistence utility"
DESCRIPTION = "mdevctl is a utility for managing and persisting devices in the mediated device \
framework of the Linux kernel. Mediated devices are sub-devices of a parent \
device (e.g. a vGPU) which can be dynamically created and potentially used by \
drivers like vfio-mdev for assignment to virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "mdevctl-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "833bd048c30846ef4dbf5dcb47182d91a2f1a8abae3ca3d8c259722f3f1dce7bc1a9e5b46bdedbf9d10248546605fa48d8cd4b914ee28570b32e78b59f25dd7f"

RPROVIDES:${PN} += "mdevctl \
mdevctl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
