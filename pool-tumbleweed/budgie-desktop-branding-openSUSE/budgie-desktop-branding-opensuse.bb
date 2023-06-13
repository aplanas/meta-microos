SUMMARY = "openSUSE branding of the Budgie Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Budgie \
desktop environment."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "20220829.3"

RPM_NAME = "budgie-desktop-branding-openSUSE-20220829.3-1.2.noarch.rpm"
RPM_HASH = "444b00702d4fbe877020c70eefb9aee125f88f1fe67eb86c92d361136ce39a0cae242fe39d862224e7e88de126e234f3e7e49bb77b6b7e96baab5b5bf3073626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-branding \
budgie-desktop-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-icon-theme \
branding-openSUSE \
budgie-desktop \
gio-branding-openSUSE \
gtk3-metatheme-greybird-geeko \
papirus-icon-theme \
systemd-icon-branding \
wallpaper-branding-openSUSE"

inherit rpm
