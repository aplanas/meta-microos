SUMMARY = "CLI interface for RepRap"
DESCRIPTION = "Pronsole is a featured command line G-code sender. \
It controls the ReRap printer and integrates skeinforge. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "pronsole-2.0.0~rc7.1599393390.c451359-3.12.noarch.rpm"
RPM_HASH = "530cd8d8904b225f8fcef14aff1eed46113d2d4cdbf09b2802b726b6bdf774cf1e8e4ddc5d8609a7ac57ba09a87fa2c73f5ea8446b3f87973d6cbc74919d52e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(pronsole.desktop) \
metainfo() \
metainfo(pronsole.appdata.xml) \
pronsole"

RDEPENDS:${PN} += "/usr/bin/python3 \
Printrun-common"

inherit rpm
