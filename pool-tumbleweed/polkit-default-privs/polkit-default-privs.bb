SUMMARY = "SUSE PolicyKit default permissions"
DESCRIPTION = "Predefined polkit profiles for different usage scenarios like desktop and \
server. These profiles define the kind of authentication required for various \
polkit actions used across applications."
LICENSE = "GPL-2.0-or-later"

PV = "1550+20230606.5001571"

RPM_NAME = "polkit-default-privs-1550+20230606.5001571-1.1.noarch.rpm"
RPM_HASH = "2712d82336dca72c1391e96231ef9d9ed346d6232361ea967013758ca3b86c88fad2f196819f95d44d46146034c4b134a978fd57cad7de60f0bfb0982ded9f14"
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
