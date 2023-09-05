SUMMARY = "SUSE PolicyKit default permissions"
DESCRIPTION = "Predefined polkit profiles for different usage scenarios like desktop and \
server. These profiles define the kind of authentication required for various \
polkit actions used across applications."
LICENSE = "GPL-2.0-or-later"

PV = "1550+20230829.1a9a761"

RPM_NAME = "polkit-default-privs-1550+20230829.1a9a761-1.1.noarch.rpm"
RPM_HASH = "22600dff9cb8ff88ba815c36ef9647d936b274e33a8abbcbdb54de36c32b53459d3ec2a5cf0f91fdb584467486933d12d2f5c0a255b33679bc3fd493968fc193"
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
