SUMMARY = "openSUSE Branding of xfdesktop"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Desktop Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfdesktop-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "e703d5e7b436edbb8e37e7a2f551a6b06d4a86c3d8c83f7fd7ca8f19b82a43f5a1c2d31a5b322973c819f117d0edb2c750c6801928b90e55f41c6f80a3f5116d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfdesktop-branding-openSUSE \
xfce4-desktop-branding-openSUSE \
xfdesktop-branding \
xfdesktop-branding-openSUSE"

RDEPENDS:${PN} += "desktop-data-openSUSE \
wallpaper-branding"

inherit rpm
