SUMMARY = "DesktopEntry Execution"
DESCRIPTION = "A simple utility to handle XDG autostart entries."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "dex-0.9.0-1.8.noarch.rpm"
RPM_HASH = "a81158136cd9d131587d0e7611273277077e5ece73c53fa5244f80cf22a186e09245790c6fe9df9f9d2c88534938f5c441f902e649279949de8e009af8bfa55b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dex"
RDEPENDS:${PN} += "/usr/bin/env \
python3"

inherit rpm
