SUMMARY = "Application and environment virtualization"
DESCRIPTION = "Singularity provides functionality to make portable \
containers that can be used across host environments."
LICENSE = "BSD-3-Clause-LBNL"

PV = "1.1.8"

RPM_NAME = "apptainer-1.1.8-1.1.aarch64.rpm"
RPM_HASH = "c115a15fd6641f5ca63113822809c6ca489f87b920fadc669f5c6c7bffdeb3fc1498f5de41f7eb61dc80028952b65e9d25d2a5eb75fc3625d526365e0070d462"

RPROVIDES:${PN} += "apptainer apptainer(aarch-64) config(apptainer) singularity"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) libfuse3.so.3(FUSE_3.12)(64bit) libfuse3.so.3(FUSE_3.2)(64bit) liblz4.so.1()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libseccomp.so.2()(64bit) libz.so.1()(64bit) permissions squashfs"

inherit rpm
