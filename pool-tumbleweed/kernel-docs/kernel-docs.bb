SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-docs-6.3.4-1.1.noarch.rpm"
RPM_HASH = "1ec7c86319e34bfdf98b8f3547500479d2431e72737150d5b6099775ce7c2d16196a697763fbcd562fe3f8af204d5e74c9a49e8997902c2966539f0b916fabf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-2c66b1f470678d30f7dc560d1f3770e6e13b5e65"

RDEPENDS:${PN} += ""

inherit rpm
