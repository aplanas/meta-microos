SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-source-6.4.12-1.1.noarch.rpm"
RPM_HASH = "7f04830b595a3a2c740f3f1f3222269b994c72845a4e6962a28c795e26b45e77a6845c2b88654bbcba9c761cbaf6a6b1fa46944af2e950252e26672da61c7e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
