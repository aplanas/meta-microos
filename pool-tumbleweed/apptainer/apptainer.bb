SUMMARY = "Application and environment virtualization"
DESCRIPTION = "Singularity provides functionality to make portable \
containers that can be used across host environments."
LICENSE = "BSD-3-Clause-LBNL"

PV = "1.1.8"

RPM_NAME = "apptainer-1.1.8-1.4.aarch64.rpm"
RPM_HASH = "0313780650a91e6d76e94e0fe9221fc4ddbe072e3c151223671098b4d35f8983dc6a0ba34874a6b9e80e166278ba13f7e2733e8c337ce67e416b43121e619123"

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
