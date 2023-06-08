SUMMARY = "Graphical configuration frontend and launcher for FS-UAE"
DESCRIPTION = "FS-UAE Launcher is a graphical configuration program and launcher for FS-UAE."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.68"

RPM_NAME = "fs-uae-launcher-3.1.68-1.3.noarch.rpm"
RPM_HASH = "b7ceb5d0a715b40fe97c2940583ea2026ad1ffe59277cc95c907809629e248f254449860235edc51777f541b879614098cde2febba8c8414a349b36bc885bf3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(fs-uae-launcher.desktop) fs-uae-launcher"
RDEPENDS:${PN} += "/usr/bin/python3 fs-uae python3-opengl python3-qt5 python3-requests"

inherit rpm
