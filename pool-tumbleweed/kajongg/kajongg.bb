SUMMARY = "4 Player Mahjongg game"
DESCRIPTION = "Kajongg is a version of the four player Mahjongg tile game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kajongg-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2de47909c13b2e0cb81b46b194e5245d6e488d8bc529f14d4aafae986efdfce982839aafe7b2754087838d1183bf2b59aea6a41a32a51929cbff61a85413457a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg"

RDEPENDS:${PN} += "/usr/bin/env \
python3-Twisted \
python3-qt5"

inherit rpm
