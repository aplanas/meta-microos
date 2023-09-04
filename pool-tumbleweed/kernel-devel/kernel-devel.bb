SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-devel-6.4.11-1.2.noarch.rpm"
RPM_HASH = "7d75d4adb5fb7df57cbebc68e6edbe95d683d13ec099c372af600bdebda2402f73834baad5efb8ea5adcde233785a4187132c97e66b7114a81ea9496ff3b8db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
