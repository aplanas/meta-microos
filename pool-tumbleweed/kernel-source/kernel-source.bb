SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-source-6.4.6-1.1.noarch.rpm"
RPM_HASH = "3dea33787bbd6744c70d22ed5013b7429a41d9d2018f3d0b987394dce1e10f1370679dc7b5cb71999ebe9e3f8a8a73d5fcda743c08134b5d4d90f64f18160e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-55520bc826c5b1d40857ed0536eb87438cb95192 \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
