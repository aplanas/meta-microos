SUMMARY = "openSUSE Branding of xfwm4"
DESCRIPTION = "This package provides the openSUSE look and feel for the xfwm4 window manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfwm4-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "c77b3d0823954dd02a2ee24190fb4bfe421f24afff7b36cab2e74d54a6b12da08363ca9aa580f1f42431d6b62e3536e71011c8f9c6393e13a64ea9cf581428d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfwm4-branding-openSUSE \
xfwm4-branding \
xfwm4-branding-openSUSE"

RDEPENDS:${PN} += "noto-sans-fonts"

inherit rpm
