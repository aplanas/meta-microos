SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-source-6.3.9-1.1.noarch.rpm"
RPM_HASH = "76d271c50a758d2fd49efd5b7898c0b5f4679436c4491265b6b62eb2a690ee1d09249aabd7f10e7bdb6c344b5f6da23c422c10d32a77f3e1fabfaaa093b4d27a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source \
kernel-source-srchash-0df701dd2c208f4843cf219b4b26b533ada9bd34 \
linux \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-devel \
sed"

inherit rpm
