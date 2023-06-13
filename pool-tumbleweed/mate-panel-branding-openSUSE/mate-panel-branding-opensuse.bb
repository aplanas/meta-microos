SUMMARY = "openSUSE Branding of mate-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the MATE Panel."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-panel-branding-openSUSE-42.1-5.5.noarch.rpm"
RPM_HASH = "e6e34caff9a2120433e6e1829f701d5b3c0cd4c973bfc56faefa5032def5ea7549b24173a076899efef550efa3d4b6bd2939d65cf68a37e94ce04b4b431783ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-panel-branding \
mate-panel-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
mate-applet-softupd \
mate-applets \
mate-menu \
mate-panel"

inherit rpm
