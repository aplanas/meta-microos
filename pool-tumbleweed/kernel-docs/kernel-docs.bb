SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-docs-6.4.12-1.1.noarch.rpm"
RPM_HASH = "bff95fdefd16bdb6bc64ac6f6d2fc1157998abb02abc520214660134c0ef32ebef7f93d22df3f780cae792b636f70eb9c4fdfb163801a436d8425038fb656480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-f5aa89b3e95322c79e43c459f5b6862dec51fc5f"

RDEPENDS:${PN} += ""

inherit rpm
