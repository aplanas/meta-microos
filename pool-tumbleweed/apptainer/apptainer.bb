SUMMARY = "Application and environment virtualization"
DESCRIPTION = "Singularity provides functionality to make portable \
containers that can be used across host environments."
LICENSE = "BSD-3-Clause-LBNL"

PV = "1.2.2"

RPM_NAME = "apptainer-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "942e1c6c81868044ebcf1db942f8747769c63ba4ee8b366b79d4d5bc736a171db30dba39946863f44c9fce1b0a7c177e747a48bc0fc3eaed968fac8d48a6fa31"

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
