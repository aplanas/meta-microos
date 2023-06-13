SUMMARY = "DOSBox Game Launcher"
DESCRIPTION = "DBGL is a Java front-end for DOSBox, based largely upon the \
proven interface of D-Fend."
LICENSE = "GPL-2.0-only"

PV = "0.92"

RPM_NAME = "dbgl-0.92-1.12.noarch.rpm"
RPM_HASH = "54293aa5c64b537a687ef7c97f59715a3d934fef67c03eab9069a0a123bf872594baedc13374b64d0fdd2433d54acd5f3476f1501468f00795eb650cfc22ddad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(dbgl.desktop) \
dbgl \
metainfo() \
metainfo(dbgl.appdata.xml)"

RDEPENDS:${PN} += "/bin/bash \
apache-commons-io \
apache-commons-lang3 \
apache-commons-text \
dosbox \
eclipse-swt \
java \
javapackages-tools"

inherit rpm
