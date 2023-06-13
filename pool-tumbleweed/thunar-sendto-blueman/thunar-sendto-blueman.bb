SUMMARY = "A sendto integration for Thunar"
DESCRIPTION = "This package add sendto integration for Thunar."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "thunar-sendto-blueman-2.3.5-1.3.noarch.rpm"
RPM_HASH = "a429a87ab93ca056dfef2a71a98d75f4c23b782f1f4882acca7ffd3c3fda13ea7a6e6f51cf3fc39a27e053c1c409021933776c3b6c4f34dcc0fab4f975c396ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "thunar-sendto-blueman"

RDEPENDS:${PN} += "blueman"

inherit rpm
