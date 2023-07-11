SUMMARY = "openSUSE Branding of xfce4-settings"
DESCRIPTION = "This package provides the openSUSE look and feel for Xfce."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-settings-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "dd695f9c3b92c65ccf8d811161614c153e8fb8716e12e527f45b9f2bc7daa98970f1bf9aa5ab97ebf05bb09eed1664e90c8409cf46397f6a0d845ffb36db0fd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-settings-branding-openSUSE \
xfce4-settings-branding \
xfce4-settings-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-xfce-icon-theme \
desktop-data-openSUSE \
gtk2-metatheme-adwaita \
gtk2-metatheme-greybird-geeko \
gtk3-metatheme-adwaita \
gtk3-metatheme-greybird-geeko \
hack-fonts \
metatheme-greybird-geeko-common \
noto-coloremoji-fonts \
noto-sans-fonts"

inherit rpm
