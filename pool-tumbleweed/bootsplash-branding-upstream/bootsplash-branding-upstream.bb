SUMMARY = "Unbranded Bootsplash Theme"
DESCRIPTION = "This package contains a theme without trademarked logos."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "bootsplash-branding-upstream-3.3-13.15.noarch.rpm"
RPM_HASH = "eb1e1da10ef3e774a1a87af4fa9e56962f72be0c396ee6dcf42d09e09bd0a56e71950984391bca17265535f9926ac692af90b715bb1a6326e0d92dc1344b5d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootsplash-branding \
bootsplash-branding-upstream \
config-bootsplash-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bootsplash \
fillup \
perl"

inherit rpm
