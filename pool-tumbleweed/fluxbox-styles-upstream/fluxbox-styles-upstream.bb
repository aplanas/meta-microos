SUMMARY = "Upstream bundle of styles for fluxbox"
DESCRIPTION = "Fluxbox is a stacking windowmanager for the X Window System which \
started as a fork of Blackbox 0.61.1 in 2001. Its user interface has \
only a taskbar, a pop-up menu accessible by right-clicking on the \
desktop, and minimal support for graphical icons. \
 \
This package provides the upstream bundle of styles."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "fluxbox-styles-upstream-1.3.7-1.9.noarch.rpm"
RPM_HASH = "d38d7c004f5b0061898c09e825cc9f5a3a5e0498390a5ea5b3bc78adc181e6b966a7300d55dd4e6e8afc1f218f7e97e3bb290c03f6e5ad59eed3e34f6dd7f425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fluxbox-styles-upstream"

RDEPENDS:${PN} += "fluxbox"

inherit rpm
