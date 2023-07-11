SUMMARY = "Development files for GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "e1e1c1a06ee02ae07bdc874588cc622a03609c408328f027540024bd899d737d91e52e49d7db5e3ebbbca2a15683d6560533ddeef079dd44e07cd509650d9001"

RPROVIDES:${PN} += "gnome-shell-devel"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
