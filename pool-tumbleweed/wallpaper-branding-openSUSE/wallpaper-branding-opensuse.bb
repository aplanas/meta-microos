SUMMARY = "openSUSE Tumbleweed default wallpapers"
DESCRIPTION = "openSUSE Tumbleweed defaults wallpapers"
LICENSE = "BSD-3-Clause"

PV = "84.87.20230227"

RPM_NAME = "wallpaper-branding-openSUSE-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "a519f755454c0e2af90ae5cbc9c5dacc6814a4dd9f14b78aae0d0eae38f4fdd474dafb09fce088db10569686f26d142985be23b32b14a094cf2670dda19cd4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wallpaper-branding \
wallpaper-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
update-alternatives"

inherit rpm
