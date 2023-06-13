SUMMARY = "openSUSE branding of sway"
DESCRIPTION = "This package provides the openSUSE look and feel for sway."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "sway-branding-openSUSE-0.15.2-1.1.noarch.rpm"
RPM_HASH = "dd1d90a572c355f62c941e9b800e454e24c102bfe3a41edc3fa31e9c95d9026b90f96c7a012bb49278d926d7216682241accfaa019dc2b20945dcc132a8aad7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sway-branding-openSUSE) \
sway-branding \
sway-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
SwayNotificationCenter \
bc \
brightnessctl \
fontawesome-fonts \
jq \
pamixer \
patterns-sway-sway \
pavucontrol \
playerctl \
polkit-gnome \
sway \
wallpaper-branding-openSUSE \
wob"

inherit rpm
