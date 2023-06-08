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

RPM_NAME = "PackageKit-branding-upstream-1.2.5-9.3.noarch.rpm"
RPM_HASH = "e121c566fbb01c036bde80705f276e2769388485fd26d9c34118622e049c7baba880f9b8ed15e50b7b719251cb0d4ec0769305e560e3bf9e2d0436a26690f8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-branding PackageKit-branding-upstream config(PackageKit-branding-upstream)"
RDEPENDS:${PN} += "PackageKit"

inherit rpm
