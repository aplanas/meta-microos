SUMMARY = "openSUSE branded KDE settings"
DESCRIPTION = "This package does not contain anything by itself, but pulls in \
default settings and extensions for the standard openSUSE \
desktop."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-workspace-branding-openSUSE-84.87~git20230131T131056~433af24-8.1.noarch.rpm"
RPM_HASH = "b992a916acb2676c76559e4848b638ef9a3d57a2fcb3bcd7683b4540bbb5302049f02851387dbb9c66e78e46f61c021334e87493e8f7260e02e5f10ca01b1dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-branding \
plasma5-workspace-branding-openSUSE"

RDEPENDS:${PN} += "plasma5-defaults-openSUSE \
plasma5-workspace \
wallpaper-branding-openSUSE"

inherit rpm
