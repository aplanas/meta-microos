SUMMARY = "openSUSE branded KDE settings"
DESCRIPTION = "This package does not contain anything by itself, but pulls in \
default settings and extensions for the standard openSUSE \
desktop."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-workspace-branding-openSUSE-84.87~git20230131T131056~433af24-9.1.noarch.rpm"
RPM_HASH = "980f878b2b609ce84a4eb1c1da175190dad9428d59319d0ff7d5c2745c66a73139eb7dd106caf4f7c828545f1253fa86b08aa9e38fcd6c40a63baa36e4857a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-branding \
plasma5-workspace-branding-openSUSE"

RDEPENDS:${PN} += "plasma5-defaults-openSUSE \
plasma5-workspace \
wallpaper-branding-openSUSE"

inherit rpm
