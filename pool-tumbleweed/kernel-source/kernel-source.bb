SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-source-6.4.3-1.1.noarch.rpm"
RPM_HASH = "386f61e4d5f7fc920703f1a55b9642ebe8812e70ee1cfe974e8d39a95f3170f73e2a3264a116a16eacdb27ed9cdf679882b0eb7a6aee7a59f478cf09333bc2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-5ab030f1f07fd96746960bce337ec62fc11b6a9a \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
