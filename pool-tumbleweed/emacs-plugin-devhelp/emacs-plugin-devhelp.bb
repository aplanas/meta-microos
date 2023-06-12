SUMMARY = "Devhelp plugin for Emacs"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for Emacs."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "emacs-plugin-devhelp-43.0-2.1.aarch64.rpm"
RPM_HASH = "096cd54d68b625b5208ca6b81ea9fe236ec8773136faefa30c41af2b48d77cbe829bf604fbddde66ac3190a58ad6732ff13250d01a5bcf51868d3d6d9b380c1c"

RPROVIDES:${PN} += "emacs-plugin-devhelp \
emacs-plugin-devhelp(aarch-64)"
RDEPENDS:${PN} += "devhelp \
emacs"

inherit rpm
