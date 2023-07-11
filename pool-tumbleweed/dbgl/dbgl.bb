SUMMARY = "DOSBox Game Launcher"
DESCRIPTION = "DBGL is a Java front-end for DOSBox, based largely upon the \
proven interface of D-Fend."
LICENSE = "GPL-2.0-only"

PV = "0.92"

RPM_NAME = "dbgl-0.92-1.13.noarch.rpm"
RPM_HASH = "68b0e0c6a286af974bddb389761a3bd979fe373e7bd253651cce00bacd44e07019655207522755f1e400a96055e8f00a8be724366838c3347bfb2ade91c20706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbgl"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-io \
apache-commons-lang3 \
apache-commons-text \
dosbox \
eclipse-swt \
java \
javapackages-tools"

inherit rpm
