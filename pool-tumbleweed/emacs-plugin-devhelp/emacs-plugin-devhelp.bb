SUMMARY = "Devhelp plugin for Emacs"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for Emacs."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "emacs-plugin-devhelp-43.0-2.2.aarch64.rpm"
RPM_HASH = "b85e69feed26caaaca770a8d30bb879486140bed78558b53e38bad8b4ad03dea54a0844c8845faea4dc6ba1aeba61d1201bb4eca14f11192f68649a16ac872d2"

RPROVIDES:${PN} += "emacs-plugin-devhelp"

RDEPENDS:${PN} += "devhelp \
emacs"

inherit rpm
