SUMMARY = "Development files for GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "59e524a4c6ac67ff55fc6695d609e185cc8ae46f62ef7885aba243d4212eff44addb4bf9a3f4f862f7485b817ec7c930431652ff0d7aa5ae78ec3abf4acf1cb0"

RPROVIDES:${PN} += "gnome-shell-devel"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
