SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-docs-6.4.6-1.1.noarch.rpm"
RPM_HASH = "c821b88722821077608c4bf300fd089d300ca9bde90ee6a1ca3ba1148d624dd2127876ab7cecac2d43f4cac0ef798e54b4820a1b82c2d389e50cbec7ed945d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-55520bc826c5b1d40857ed0536eb87438cb95192"

RDEPENDS:${PN} += ""

inherit rpm
