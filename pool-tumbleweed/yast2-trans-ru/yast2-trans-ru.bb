SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ru-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "574094ab9a50c8d8bef1302a1131061a35a4f714521200b3d6a83fc2b0ad1e3406eba13af767e5da10de0337da2d987b540d06d1582bdee2c6883fc0e30889a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm
