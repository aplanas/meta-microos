SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-devel-6.4.12-1.1.noarch.rpm"
RPM_HASH = "170748b6a5e77bc8d8d1922d2c86499cc7e67e83670f550c18538fb37ae92e8d7ba1d392ad92a0483e0a64606ef69e7a88f39435cae1b738602e10ea946886d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
