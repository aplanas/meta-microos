SUMMARY = "4 Player Mahjongg game"
DESCRIPTION = "Kajongg is a version of the four player Mahjongg tile game."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kajongg-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9b846d9c1bce72f1745620e6fcdf5f50a2b20ddcea24d0def0a97a64dba54a31cfd7ac957c05bd5e47c8b89d55a62fdca37431d64525e14a3ff5e59ea042f439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg"

RDEPENDS:${PN} += "/usr/bin/env \
python3-Twisted \
python3-qt5"

inherit rpm
