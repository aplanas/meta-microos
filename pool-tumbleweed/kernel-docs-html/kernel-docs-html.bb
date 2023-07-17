SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-docs-html-6.4.2-1.1.noarch.rpm"
RPM_HASH = "353737fc77eb895c62a2ba7f4cf65efd9e80c722ad9d6648bcd91aa50cd402f26df83b38c67330690b2a7fa35efe7eb7beee673a77f97e0e996d26b33865574e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
