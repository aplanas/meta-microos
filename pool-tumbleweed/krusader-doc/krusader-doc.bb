SUMMARY = "Krusader documentation"
DESCRIPTION = "Krusader is an advanced twin panel (commander style) file manager for KDE Plasma \
and other desktops in the *nix world. \
 \
This package contains the krusader documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "krusader-doc-2.8.0-1.4.aarch64.rpm"
RPM_HASH = "615c0a1bca64c4c2cb38b9853f300e47261c2a7c2e309e0ba6e9fd7b7ffaba73b41d0741c287b0ff4257f24888575af3d2dcc962a01cb57b88837633d1fc5acf"

RPROVIDES:${PN} += "krusader-doc"

RDEPENDS:${PN} += ""

inherit rpm
