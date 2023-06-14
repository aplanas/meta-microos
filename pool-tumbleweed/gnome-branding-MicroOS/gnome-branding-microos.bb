SUMMARY = "MicroOS Desktop default settings"
DESCRIPTION = "This package provides MicroOS defaults for GNOME settings."
LICENSE = "BSD-3-Clause"

PV = "20230420"

RPM_NAME = "gnome-branding-MicroOS-20230420-1.1.noarch.rpm"
RPM_HASH = "b4fdfa657a7273cd88e70da2e6b76b6f531f6a71f28223ae0d3911ad47ef563ae8826e856e3a01148709d1bd58dac66487e6f870f700f734ee21164043973ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gnome-branding-MicroOS \
gnome-branding-MicroOS"

RDEPENDS:${PN} += "/bin/sh \
flatpak \
gio-branding-openSUSE \
sound-theme-freedesktop \
transactional-update \
zenity"

inherit rpm
