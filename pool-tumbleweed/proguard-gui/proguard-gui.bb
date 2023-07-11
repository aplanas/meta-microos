SUMMARY = "GUI for proguard"
DESCRIPTION = "A GUI for proguard."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "proguard-gui-6.2.0-1.20.noarch.rpm"
RPM_HASH = "f77c167220f97d897012ab076a293e7d3db1e9c9439b7abec58b3d96ec34a28d61727743b0e5c458e8294e45e075404e8a84d9adcc064f2f76947b81f3402b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sf.proguard-proguard-gui \
mvn-net.sf.proguard-proguard-gui-pom- \
proguard-gui"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.sf.proguard-proguard-base \
mvn-net.sf.proguard-proguard-retrace"

inherit rpm
