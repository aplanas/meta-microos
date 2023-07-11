SUMMARY = "Upstream bundle of styles for fluxbox"
DESCRIPTION = "Fluxbox is a stacking windowmanager for the X Window System which \
started as a fork of Blackbox 0.61.1 in 2001. Its user interface has \
only a taskbar, a pop-up menu accessible by right-clicking on the \
desktop, and minimal support for graphical icons. \
 \
This package provides the upstream bundle of styles."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "fluxbox-styles-upstream-1.3.7-1.10.noarch.rpm"
RPM_HASH = "b37d3dde0ae6069a8323022d7da2f580e83706a4a2210e97f47f1f24937c173115d4b61a5102162266c31b7492aa6726e3174c5f0dbb2986a2211f08cfa7a31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fluxbox-styles-upstream"

RDEPENDS:${PN} += "fluxbox"

inherit rpm
