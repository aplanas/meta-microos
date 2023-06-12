SUMMARY = "Arc Icon Theme"
DESCRIPTION = "A flat icon theme that mainly includes icons for directories and \
mimetypes. \
Requires Moka or Adwaita as fallback icons."
LICENSE = "GPL-3.0+"

PV = "20161122"

RPM_NAME = "arc-icon-theme-20161122-1.15.noarch.rpm"
RPM_HASH = "76cee456dfd2e2e37d0f231629943e4a6e0519dbf8702583d9156ed0bb53a19f2cad21fe918bbbb613285078f01ff767122c8b5d842d2567e530680054b1a9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arc-icon-theme"
RDEPENDS:${PN} += "/bin/sh \
adwaita-icon-theme"

inherit rpm
