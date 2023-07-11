SUMMARY = "The hxtools shell environment"
DESCRIPTION = "Bash environment settings from hxtools. Particularly, this provides \
the SUSE 6.x ls color scheme, and a reduced PS1 that shows only the \
rightmost parts of a path."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-profile-20230411-1.2.noarch.rpm"
RPM_HASH = "b467ea35ba18a9c320b714237969b1bde3d2a869431bd7b07beefdafb8ccad9588fb0eab3e9105c4db5581e540da1b235075f09568b989b20d118867e87e0584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hxtools-profile \
hxtools-profile"

RDEPENDS:${PN} += "hxtools \
hxtools-data \
hxtools-scripts"

inherit rpm
