SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python39-libvmdk-20221124-4.1.aarch64.rpm"
RPM_HASH = "f952f97b3c3cb4ae774e93f38216a2a626d8f9941365903543f419765882bdb089faf63e3bb83dbe9264e107aea67db38f7f9d52a4a17934c9d4813e6b5b59f4"

RPROVIDES:${PN} += "python39-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm
