SUMMARY = "Additional Plasma Wallpapers"
DESCRIPTION = "Additional wallpapers for Plasma Workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-workspace-wallpapers-5.27.6-1.1.noarch.rpm"
RPM_HASH = "ecf839451da4b365bea58ae2c828e3ef5144e067e38057af1c3bf0c46f5f1b7ca7c6b84e54f7621deaeb02f4eceab3c498b955975790149ddf60f90542df8a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
