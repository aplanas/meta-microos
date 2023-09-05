SUMMARY = "Default configuration file and branding from the Plymouth upstream"
DESCRIPTION = "This package contains the /usr/share/plymouthd.defaults which contains the basic \
settings and branding from the upstream."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-branding-upstream-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "3a4ce011dcce9c9e499fc9986826f698a0248db723862ccde875a6534277e311cda772ff1e5dbffb0ddde65e642f20d108de65cec42bb0eb33624f48fe21fecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding \
plymouth-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
