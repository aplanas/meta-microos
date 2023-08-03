SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-devel-6.4.6-1.1.noarch.rpm"
RPM_HASH = "0aa3c95a71e68fef4dc198a9a5a4e4cba9713fc929d03a1e8eaabe305e4d37aebdb2617b23848a9b7b9ad60e77aa764d3c8c6d547ed29c849fae92852763ea8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
