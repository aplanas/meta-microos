SUMMARY = "Icons Theme"
DESCRIPTION = "Icons for the Deepin Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "2021.11.24"

RPM_NAME = "deepin-icon-theme-2021.11.24-3.8.noarch.rpm"
RPM_HASH = "4a7eee90472b7133255a9fdcfe0e4e74942f16ccb94ff832c28c60d90e5bd4b1d45662d23c136c1fbed565f659156175408c5da95cdac8c32275a22e128c227c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-icon-theme"
RDEPENDS:${PN} += ""

inherit rpm
