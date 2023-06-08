SUMMARY = "Faenza-Ambiance Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items. \
 \
Faenza-Ambiance is suitable with dark panel and toolbars."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-ambiance-1.3.1-1.4.noarch.rpm"
RPM_HASH = "00c8f2c8f0f2c060bf3b6af9c168c499a12d635f7284267e7b9bd5bff1860ea75d1308bef75e9313b9efc106d16a03f3f203e039c643a22c535975f656fa2783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-ambiance"
RDEPENDS:${PN} += "/bin/sh faenza-icon-theme-darkest"

inherit rpm
