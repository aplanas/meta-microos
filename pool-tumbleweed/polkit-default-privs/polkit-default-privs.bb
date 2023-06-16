SUMMARY = "SUSE PolicyKit default permissions"
DESCRIPTION = "Predefined polkit profiles for different usage scenarios like desktop and \
server. These profiles define the kind of authentication required for various \
polkit actions used across applications."
LICENSE = "GPL-2.0-or-later"

PV = "1550+20230517.ab68b2d"

RPM_NAME = "polkit-default-privs-1550+20230517.ab68b2d-1.1.noarch.rpm"
RPM_HASH = "5d0ec374f0d4ee824df220c2583026820e38c58348e19dc23b404120643d34a49620e747cb1d5594c678b3ed444db04c070ec7a4d8de732e46317726ad2658ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polkit-default-privs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
polkit"

inherit rpm
