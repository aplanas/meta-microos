SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-source-vanilla-6.4.3-1.1.noarch.rpm"
RPM_HASH = "c102ed0e4eb728aecb3ca4f6a88254b354c3b4456047b4913652f78fbaadc2dfb2edb7d75885165beca4347a63ca0eabc55246402e0e6b800cd1288f2365966e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-macros"

inherit rpm
