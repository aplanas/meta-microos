SUMMARY = "GNOME Themes"
DESCRIPTION = "GNOME themes, including Ximian Industrial and selected background \
images."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gnome-themes-3.0.0-22.6.noarch.rpm"
RPM_HASH = "23d509dc1d48664389e2326a82da6fcc24a5ceed506c972da5eb45c7a9fd8f186b580fa20d0d243202b12ea60f7ef2d3708bd96f0c5fc84768ecc06cee5ebf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
