SUMMARY = "openSUSE branding of lightdm-slick-greeter"
DESCRIPTION = "This package provides the openSUSE look and feel for \
lightdm-slick-greeter."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "lightdm-slick-greeter-branding-openSUSE-1.0-3.5.noarch.rpm"
RPM_HASH = "fddc5771c1ba6c7f8f5aab3f02f49364173dd8b2e6946d83fc7508aa420c23112e8d68122778b8268ea697b8cb40d65a7821c453cf1b30c2b10d280cdf3ce7a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-slick-greeter-branding \
lightdm-slick-greeter-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-icon-theme \
cantarell-fonts \
gtk3-metatheme-adwaita \
lightdm-slick-greeter \
wallpaper-branding-openSUSE"

inherit rpm
