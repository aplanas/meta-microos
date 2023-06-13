SUMMARY = "Architecture independent data for Battle for Wesnoth"
DESCRIPTION = "This package contains the game data for Battle For Wesnoth. \
It is required to play the game."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-data-1.17.16-1.1.noarch.rpm"
RPM_HASH = "dc647ca11ad2f0cb60f46c55305ad6d74ec9cb8d3ef8136f3f7a1a089f5ddcf26863fab0616d91643169ed97b997a04cb08ffcedbead873af31ec43b7c53a5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-data"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
wesnoth-fslayout"

inherit rpm
