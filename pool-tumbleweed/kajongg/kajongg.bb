SUMMARY = "4 Player Mahjongg game"
DESCRIPTION = "Kajongg is a version of the four player Mahjongg tile game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kajongg-23.04.1-1.1.noarch.rpm"
RPM_HASH = "6acfbe7cc84ceb9d72b87bc1b588d9ce6a17bce09f219080aa98f4e6a9f05d1ea9be47be01eb844dcfa5f8d31264917c2425f4f1233e2a5f4335b744ad91e82d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.kde.kajongg.desktop) \
kajongg \
metainfo() \
metainfo(org.kde.kajongg.appdata.xml)"

RDEPENDS:${PN} += "/usr/bin/env \
python3-Twisted \
python3-qt5"

inherit rpm
