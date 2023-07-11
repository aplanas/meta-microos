SUMMARY = "Upstream configuration for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less. \
 \
This package provides the upstream default configuration for PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-branding-upstream-1.2.5-9.4.noarch.rpm"
RPM_HASH = "a925df3d04a6e4bcdd7797169132e65a50ffcf4220949137e72b09a5f595aafebf894de2d6b4e9c46a507bbebe5758d4db8a009c802055780768958f93b0b6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-branding \
PackageKit-branding-upstream \
config-PackageKit-branding-upstream"

RDEPENDS:${PN} += "PackageKit"

inherit rpm
