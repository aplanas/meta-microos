SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-docs-html-6.4.11-1.2.noarch.rpm"
RPM_HASH = "c027bffb8b9ee9284e75d0d8207ae571925f147e294a0dc25899c6c3484315a7d70878db8a6636f8622b39f779171ddc41fcf6755ac9e4e212d7d7943ee1ca14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
