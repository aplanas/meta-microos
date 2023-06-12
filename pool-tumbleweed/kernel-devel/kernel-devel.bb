SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-devel-6.3.4-1.1.noarch.rpm"
RPM_HASH = "90330003fc3ca1032e530f5857aec5993f8cfb1119f70b8fa9265f6219b82e6fa8f2251634da2466d2e98cfc355d74d07fe37662f60e300b36ecc11659349c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
kernel-macros"

inherit rpm
