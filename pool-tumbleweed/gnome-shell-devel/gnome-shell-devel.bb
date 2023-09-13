SUMMARY = "Development files for GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-shell-devel-44.4-1.1.aarch64.rpm"
RPM_HASH = "8103d3c602a8d05c2e8448ac22a46a752f4862684f67f879d3a46dfc43fafa06da845ae578d0e548bf7e83ccfbce2abb07d76f8bba402fad3c12f562212efb27"

RPROVIDES:${PN} += "gnome-shell-devel"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
