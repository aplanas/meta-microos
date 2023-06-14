SUMMARY = "The hxtools shell environment"
DESCRIPTION = "Bash environment settings from hxtools. Particularly, this provides \
the SUSE 6.x ls color scheme, and a reduced PS1 that shows only the \
rightmost parts of a path."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-profile-20230411-1.1.noarch.rpm"
RPM_HASH = "8b4ea7610548df9bc7d1b7e013d3adea1ff2adfb88f17f17b4c5ab9d859fd060cab5769dc2bf54cb97a7b154176a0b4acee49390e8c0f1b0b57f239b8e961555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hxtools-profile \
hxtools-profile"

RDEPENDS:${PN} += "hxtools \
hxtools-data \
hxtools-scripts"

inherit rpm
