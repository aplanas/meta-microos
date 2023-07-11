SUMMARY = "openSUSE Branding of libgarcon"
DESCRIPTION = "This package provides the openSUSE look and feel for Garcon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "libgarcon-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "d6ee99a50e76e5f5aeeb22141b6dd5d9daceab2be6aa449da88c24fbcdf4f0870a7db249bd7971eaf920f387019bce66c03f5d42fca32f38ff00e955d72aeae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libgarcon-branding-openSUSE \
libgarcon-branding \
libgarcon-branding-openSUSE"

RDEPENDS:${PN} += "desktop-data-openSUSE \
libxfce4ui-tools \
wallpaper-branding \
xfce4-settings-branding-openSUSE"

inherit rpm
