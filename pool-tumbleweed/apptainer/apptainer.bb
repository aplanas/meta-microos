SUMMARY = "Application and environment virtualization"
DESCRIPTION = "Singularity provides functionality to make portable \
containers that can be used across host environments."
LICENSE = "BSD-3-Clause-LBNL"

PV = "1.1.9"

RPM_NAME = "apptainer-1.1.9-1.1.aarch64.rpm"
RPM_HASH = "0d3473d9c5a00c6f5dec911acd9c0d0f146b9944d82477acce1768d9967a3ba1e50886514ae10f5d5fa0cc541b1915b31fbb612576b0ebe4994e650e0ec95696"

RPROVIDES:${PN} += "apptainer \
config-apptainer \
singularity"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
liblz4.so.1 \
liblzma.so.5 \
libseccomp.so.2 \
libz.so.1 \
permissions \
squashfs"

inherit rpm
