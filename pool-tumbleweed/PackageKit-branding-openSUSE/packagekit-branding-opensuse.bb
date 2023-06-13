SUMMARY = "Simple software installation management software -- openSUSE default configuration"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less. \
 \
This package provides the openSUSE default configuration for \
PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "PackageKit-branding-openSUSE-42.1-2.58.noarch.rpm"
RPM_HASH = "266c1f2d75c2913c892b2179080ca8d199f4cca50647e3538deaa7c70ce854a249b0179d35584d9549a46cafa1db90fc7d984bfe477b4e798ac0ed04037ce671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-branding \
PackageKit-branding-openSUSE \
config(PackageKit-branding-openSUSE)"

RDEPENDS:${PN} += "PackageKit"

inherit rpm
