SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-docs-html-6.4.12-1.1.noarch.rpm"
RPM_HASH = "067921b61d8a3f067388dc45f2464fad2b532284b2ccd93d3dbed36a7b9e6e3962967e485a4ea8118ac8531c772a709fc94b3394d11b5a3956140ea65df182c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
