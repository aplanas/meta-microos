SUMMARY = "Development files for GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-shell-devel-44.3-1.1.aarch64.rpm"
RPM_HASH = "5f85d3f440d3efbbb19d36579be72da75fbf67e949ddeabc6356c3308f05b1388af4efb93ff1b1773eb84acbc83503b6f7e9a71194228764a4889e71be1a01dd"

RPROVIDES:${PN} += "gnome-shell-devel"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
