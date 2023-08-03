SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-docs-html-6.4.6-1.1.noarch.rpm"
RPM_HASH = "8d24f4579a877d5eed6addf0ef2b924341cf9e23121558bd36b55aa35ea504dcbec245a925f6b4f5c218a3dc98b7b0114b527d6c336b70af6107e0ce51d9fe75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
