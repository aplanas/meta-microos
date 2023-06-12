SUMMARY = "Faenza-Mint Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-mint-1.3.1-1.4.noarch.rpm"
RPM_HASH = "168ad552f11595ea8f06b8405b94b4bfa8231d05fd14960784202cdbc2340e6aa258ded2982fa0601ad978c53b46a37a6f5bd6ec2d822901d165b991f981442d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-mint"
RDEPENDS:${PN} += "/bin/sh \
faenza-icon-theme-dark"

inherit rpm
