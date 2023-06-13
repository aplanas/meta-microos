SUMMARY = "Upstream default layout for the MATE desktop panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data. \
 \
This package contains the upstream default layout for MATE Panel."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "mate-panel-branding-upstream-1.26.3-1.1.noarch.rpm"
RPM_HASH = "f31521390836d0eaf3cc0f27a9baaba5bc13ad96dce2b8f57b0b38de5161da22828cc9a4c7d21452c2f38d464921b9a00a900d94c0dea5609e193397e740fa37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-panel-branding \
mate-panel-branding-upstream"

RDEPENDS:${PN} += "mate-panel"

inherit rpm
