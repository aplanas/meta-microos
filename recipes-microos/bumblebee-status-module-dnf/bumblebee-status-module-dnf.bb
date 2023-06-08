SUMMARY = "Widget to display DNF package update information"
DESCRIPTION = "Displays DNF package update information (<security>/<bugfixes>/<enhancements>/<other>) \
via dnf. \
 \
It takes a parameter (dnf.interval) which controls the time in seconds \
between two consecutive update checks (default = 30 minutes)"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-dnf-2.1.5-3.3.noarch.rpm"
RPM_HASH = "28915c04c24c9e88b05ade49f66222054c01b0bcf1cc813d0e80797c58ef2cbd529bf9527318c172d5905a88390a8f367b0821921141b275755969ca4b1e4a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-dnf"
RDEPENDS:${PN} += "bumblebee-status dnf"

inherit rpm
