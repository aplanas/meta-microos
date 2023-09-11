SUMMARY = "Matcha common theme files"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains common files for all Matcha themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "metatheme-matcha-common-20230403-1.1.noarch.rpm"
RPM_HASH = "405cfd577a2f75e0883b6f5bc94a743057f42644a19c5b86285ebb47f20e3b1760a607a95735cd8ba791b507c10b4548ee7d30e94437a16428d8e80c0ade0178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "matcha-gtk-theme \
metatheme-matcha-common"

RDEPENDS:${PN} += "google-roboto-fonts \
noto-sans-fonts"

inherit rpm
