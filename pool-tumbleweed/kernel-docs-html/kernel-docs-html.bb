SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-docs-html-6.4.3-1.1.noarch.rpm"
RPM_HASH = "b8e2c46613715fd66c634b40ed2414e0c3420245af6c2d9e186090d9d2fc9f5af30429d1b908bdad4ca78be33f6edaa0bfd67540340065c2414aa547be75e21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
