SUMMARY = "Faenza-Dark Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-darker-1.3.1-1.4.noarch.rpm"
RPM_HASH = "df21963a5081089097224b6da8f936504b0badcfa19aef20da0cef50ebc2a4623c5b899fe48b7f1a4d5800ac3c3c8ef1491a1885ffc513d3d693040e8694892d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-darker"

RDEPENDS:${PN} += "/usr/bin/sh \
faenza-icon-theme-darkest"

inherit rpm
