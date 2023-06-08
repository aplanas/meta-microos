SUMMARY = "openSUSE Branding of the Deepin Launcher"
DESCRIPTION = "This package provides the openSUSE Logo for the deepin-launcher"
LICENSE = "GPL-2.0-or-later"

PV = "15.4"

RPM_NAME = "deepin-launcher-branding-openSUSE-15.4-2.2.noarch.rpm"
RPM_HASH = "2246f02f7a6e8a38499d3e301eb02e1a64adeb98f90933d333ee041a47e40b1e12b73b73384ab5e3dbb2bf2cd809025fceda3a27d6c86c8642f9816a6059332c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-launcher-branding deepin-launcher-branding-openSUSE"
RDEPENDS:${PN} += "deepin-launcher"

inherit rpm
