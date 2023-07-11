SUMMARY = "Common data for eog-plugins"
DESCRIPTION = "Common data required by all Eye of Gnome plugins"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugins-data-44.0-1.2.noarch.rpm"
RPM_HASH = "e2603f5031ca18cecc6115c85c5cb28d576c6a6f0d8fbd20bf92ff78f3405ae6508968ddc85d3ffb90efdc313fb20ea85d48655efc1de1e74e07913fc9ee1b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-plugins-data"

RDEPENDS:${PN} += "eog"

inherit rpm
