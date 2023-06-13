SUMMARY = "openSUSE Branding of xfce4-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Panel."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-panel-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "5a72bd66ab02f1afe54b941a6e411c2f136f2fbc4b40197e6cc56518b98bf35f3083dca405279441429e6ab8f5bb0ab63d214382e8631d4d05dc84e70f9cf356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-panel-branding-openSUSE) \
xfce4-panel-branding \
xfce4-panel-branding-openSUSE"

RDEPENDS:${PN} += "xfce4-panel-plugin-whiskermenu"

inherit rpm
