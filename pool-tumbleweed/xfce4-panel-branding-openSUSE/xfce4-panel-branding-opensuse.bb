SUMMARY = "openSUSE Branding of xfce4-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Panel."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-panel-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "7ebf8f0729f1a2d2ee9168c7a174a13a5bd1d0dc53bedb5d0a7da22ea7a6c789501b5ab404386c22b1408a10a336ee85c37e11dddb6036d21857cfbd4582074c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-panel-branding-openSUSE \
xfce4-panel-branding \
xfce4-panel-branding-openSUSE"

RDEPENDS:${PN} += "xfce4-panel-plugin-whiskermenu"

inherit rpm
