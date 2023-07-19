SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-docs-6.4.3-1.1.noarch.rpm"
RPM_HASH = "ba86a7425ac0732a728eac138e11c9c5d0104d9431516fee45a37c8b0ebb16f6b0cdd34eb59b7635f22b1a8be9ba965b5e4eb34f8f87d5d6e39adce55cffe3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-5ab030f1f07fd96746960bce337ec62fc11b6a9a"

RDEPENDS:${PN} += ""

inherit rpm
