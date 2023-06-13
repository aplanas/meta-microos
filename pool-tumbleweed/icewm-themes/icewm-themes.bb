SUMMARY = "Themes for the IceWM Window Manager"
DESCRIPTION = "This package contains a collection of themes for the popular IceWM \
window manager. Most of them have been taken from the original 0.9.42 \
themes package. Others have been taken from http://icewm.themes.org."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "icewm-themes-0.1-689.2.noarch.rpm"
RPM_HASH = "7a2b060b50911e8e2ae961360b0050f765bd0b44f352316442431d91a8447f45bde19ef6bbb2aaca0a67a1a42cbd697fc47f626eb1bd043ae817bf4d6fbd5153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icewm-themes"

RDEPENDS:${PN} += "icewm"

inherit rpm
