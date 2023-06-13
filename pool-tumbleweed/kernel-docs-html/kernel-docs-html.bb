SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-docs-html-6.3.4-1.1.noarch.rpm"
RPM_HASH = "1158be3d6168aff204f476a065da3f8ef40f12d8a75be9a261391840afff48955384a350e0fa830c3f9de72f4ecef0d5ba561aaa83444aeac9e03b5f64c2a912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
