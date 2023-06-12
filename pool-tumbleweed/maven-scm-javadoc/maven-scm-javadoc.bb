SUMMARY = "Javadoc for maven-scm"
DESCRIPTION = "Javadoc for maven-scm."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-javadoc-1.12.0-3.3.noarch.rpm"
RPM_HASH = "46b8f14b383f31c5bd6d527680817ef2c6016bc37f1265751683c17093e794aa469f69a258eeb3639c86bbc88332af5d5e292b5a8fccf953697ad0f5c1576b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
