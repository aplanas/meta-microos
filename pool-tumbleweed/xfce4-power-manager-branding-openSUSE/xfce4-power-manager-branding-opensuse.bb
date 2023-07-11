SUMMARY = "openSUSE Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-power-manager-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "fa5e6f9fdbe6aca0851bd6304bf68375889aa405e6d0c0dda96fde45f34aa1c941ab691825fce59b49d8e51578966b4cb5058f0d3dd8f954c51f0081d05a19a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-power-manager-branding-openSUSE \
xfce4-power-manager-branding \
xfce4-power-manager-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
