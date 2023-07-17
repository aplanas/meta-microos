SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-source-6.4.2-1.1.noarch.rpm"
RPM_HASH = "be23cc47ea497cc308dfb4c50c0363b6a1e983ea20ab9e1c4d7c5d9f2afeebf717ff60ba070b43112f014254b65d7c6a227e42bbeabd80016e333cb519d1860a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-b97b89494481f3409297e494e466bdd42b1311ab \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
