SUMMARY = "openSUSE Tumbleweed default wallpapers"
DESCRIPTION = "openSUSE Tumbleweed defaults wallpapers"
LICENSE = "BSD-3-Clause"

PV = "84.87.20230227"

RPM_NAME = "wallpaper-branding-openSUSE-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "3ab5a003d9feefa05a214664a21a896693e7582da7beaadcc0a4101327dc9f7bf3d7c16074f676795a4e6d0a087469134c7a7b28dd24d50b22fa916ee1b5c866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wallpaper-branding \
wallpaper-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
