SUMMARY = "Javadoc for junit"
DESCRIPTION = "Javadoc for junit."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-javadoc-4.13.2-4.2.noarch.rpm"
RPM_HASH = "c72587c6d132cf7067e785136f84510f08a85938f7151de9978cdf185b09b6451454af47f836cce8fdb00242325b366d510c3e87b67d8041ffdeb26a741fcff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit-javadoc \
junit4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
