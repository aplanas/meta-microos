SUMMARY = "Graphical User Interface for the laptop mode tools"
DESCRIPTION = "This package contains a graphical user interface for laptop-mode-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.74"

RPM_NAME = "laptop-mode-tools-gui-1.74-3.7.noarch.rpm"
RPM_HASH = "e8617abeb53c544411ff6e48d30b1608b64f1d93510fbed08faa980498eefbf1b299b09aa4999e43a3f129a4d0276beef561822dffd06ac266aa0f4d8b67f155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laptop-mode-tools-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
laptop-mode-tools \
python3-qt5"

inherit rpm
