SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-source-6.4.11-1.2.noarch.rpm"
RPM_HASH = "82628535f605a9a6c160d318547bfe2624594a82f17aac08f9ce2d416b534ce0565c689ca2b3bc6444fded85663ae569dd89eb75c522081ae2784b0df168fa07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
