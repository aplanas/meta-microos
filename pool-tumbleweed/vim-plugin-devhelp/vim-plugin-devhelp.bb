SUMMARY = "Devhelp plugin for Vim"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for Vim."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "vim-plugin-devhelp-43.0-2.2.aarch64.rpm"
RPM_HASH = "d53c5d33b7cfd7c280b5fa5aff25a72ef28ffbc0136d34318818e08ea3aa0e9de13f3804f770918fae8058719867767af23cbdf7c22f879c44741afac9dccd6d"

RPROVIDES:${PN} += "vim-plugin-devhelp"

RDEPENDS:${PN} += "devhelp \
vim"

inherit rpm
