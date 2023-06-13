SUMMARY = "Icon themes from Ubuntu MATE"
DESCRIPTION = "This package contains icon themes from Ubuntu MATE."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "ubuntu-mate-icon-theme-22.04.17-1.4.noarch.rpm"
RPM_HASH = "816a55149ffb3df94f2a3e5401cc8c82b21ec8ed04b2d81cae1b36a3e62ba1023d7998833cc0618c86670c694ff6279aa1ec81353cbae1ac57c5c243a94d5ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-mate-icon-theme"

RDEPENDS:${PN} += "humanity-icon-theme \
ubuntu-mono-icon-theme"

inherit rpm
