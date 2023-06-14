SUMMARY = "openSUSE Branding of xfwm4"
DESCRIPTION = "This package provides the openSUSE look and feel for the xfwm4 window manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfwm4-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "222463f35ca3b33924ab17d957f12b433ad8c7c2b0b2560cf5e27c294da8bc1508a7c34e91f2bf86b24e72f0a175aaa7e9238712d769fd73a181bd565b1c6807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfwm4-branding-openSUSE \
xfwm4-branding \
xfwm4-branding-openSUSE"

RDEPENDS:${PN} += "noto-sans-fonts"

inherit rpm
