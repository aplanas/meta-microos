SUMMARY = "Application and environment virtualization"
DESCRIPTION = "Singularity provides functionality to make portable \
containers that can be used across host environments."
LICENSE = "BSD-3-Clause-LBNL"

PV = "1.1.8"

RPM_NAME = "apptainer-1.1.8-1.2.aarch64.rpm"
RPM_HASH = "68ce0a24f866dccc576394312da71ff0da358b03e1dab1f419862d2ea420964f85f44123e43ab2e3fe6681cbe7820848f02c55bd56860cb18e26c56394d41e93"

RPROVIDES:${PN} += "apptainer \
config-apptainer \
singularity"

RDEPENDS:${PN} += "/bin/sh \
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
