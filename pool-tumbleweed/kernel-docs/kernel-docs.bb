SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-docs-6.3.9-1.1.noarch.rpm"
RPM_HASH = "535c724cbd0785f707e5bd60649f26d6812db1b653e5fb8754e890b3dc4aba3dec1a7b001aef2bdb9475ec9b5644cb181320a2225272e5abec4f2fef7d73eb91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-0df701dd2c208f4843cf219b4b26b533ada9bd34"

RDEPENDS:${PN} += ""

inherit rpm
