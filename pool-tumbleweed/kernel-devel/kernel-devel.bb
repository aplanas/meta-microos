SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-devel-6.4.3-1.1.noarch.rpm"
RPM_HASH = "9efda81c8ab73cfbbfd2bf4d4d4d5024891c82422c719821205f700933fe1c3f9e81186912949c58f379b1c6c3583fd677b3ddc05c56d992c8f7296fec4690a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
