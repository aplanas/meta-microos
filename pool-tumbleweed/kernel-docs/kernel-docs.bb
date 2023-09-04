SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-docs-6.4.11-1.2.noarch.rpm"
RPM_HASH = "3a8e7cd546bd10b2814e5158e71c8d25cab2cc528e1e71b470df25d0156d213f0ede8ff2aa0eef9d3bfe1ab082486e08333e137f27de2eb1fbd7ec57b0057297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-2a5b3f66898e9ecfa282f4399923c9546d3bc54d"

RDEPENDS:${PN} += ""

inherit rpm
