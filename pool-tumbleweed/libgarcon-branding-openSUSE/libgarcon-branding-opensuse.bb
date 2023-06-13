SUMMARY = "openSUSE Branding of libgarcon"
DESCRIPTION = "This package provides the openSUSE look and feel for Garcon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "libgarcon-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "1429ad2e7ddeed51a1f4776bf9e62ea7207184c801564ca5ce45c98219c3e105ef2429973e3df700988dda6dffdbd647927131b7c8ee09dc901ff4ef46b1d169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libgarcon-branding-openSUSE) \
libgarcon-branding \
libgarcon-branding-openSUSE"

RDEPENDS:${PN} += "desktop-data-openSUSE \
libxfce4ui-tools \
wallpaper-branding \
xfce4-settings-branding-openSUSE"

inherit rpm
