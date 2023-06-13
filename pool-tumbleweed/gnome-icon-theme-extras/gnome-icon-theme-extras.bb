SUMMARY = "GNOME Icon Theme Extras"
DESCRIPTION = "Extra GNOME icons for specific devices and file types."
LICENSE = "CC-BY-SA-3.0"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-extras-3.12.0-3.18.noarch.rpm"
RPM_HASH = "e95d26440717fbf9c86f6edb8174b8e632de83c11efcbd33e7b18ff0c8a7566fc87a8ffcea2f4c1a1e8c8bbb8539ea2d3d7d7437fa945f2e18ad93c0cfab099d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme-extras"

RDEPENDS:${PN} += "/bin/sh \
gnome-icon-theme"

inherit rpm
