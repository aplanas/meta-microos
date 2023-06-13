SUMMARY = "Faenza-Dark Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-dark-1.3.1-1.4.noarch.rpm"
RPM_HASH = "4f8ec2532e52c1a104aa59062eaf3ba391973cfe14c8378099b406c3e0415d0d86a64b548805d9daf1cc2bfff18e87f68e6ddc6ec36bf71735ccc2ef915095a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-dark"

RDEPENDS:${PN} += "/bin/sh \
faenza-icon-theme"

inherit rpm
