SUMMARY = "Faenza Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-1.3.1-1.4.noarch.rpm"
RPM_HASH = "43b3481150d0330c8c1e6dc8406647dd26201647c99905d83ee67806c30aad2f125772577895b6be4c5221aa88d9d5b80ff08eebdbaa16315d353ec4cd82041a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm
