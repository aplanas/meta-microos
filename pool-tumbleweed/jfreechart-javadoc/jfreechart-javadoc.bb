SUMMARY = "Javadocs for jfreechart"
DESCRIPTION = "This package contains the API documentation for jfreechart."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "jfreechart-javadoc-1.0.19-1.19.noarch.rpm"
RPM_HASH = "7e87273f038597810cdbed62d682ad0d5663ea0791bfb9634192b8f0c02b15504ea9859f0e5f7f6df7d5ba00b7f1a631a1982b800c7aed22a3dc9e0ca26355c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jfreechart \
jpackage-utils"

inherit rpm
