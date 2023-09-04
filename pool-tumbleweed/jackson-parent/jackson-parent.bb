SUMMARY = "Parent pom for all Jackson components"
DESCRIPTION = "Project for parent pom for all Jackson components."
LICENSE = "Apache-2.0"

PV = "2.15"

RPM_NAME = "jackson-parent-2.15-1.1.noarch.rpm"
RPM_HASH = "2f3e572253bec926ef2db7d787e49478c1079798e6658bcf9efa88168dde8a55e3b64fb083067954e3f6787f3258d506834c50580db663a917c2dca1742b2475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-parent \
mvn-com.fasterxml.jackson-jackson-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml-oss-parent-pom-"

inherit rpm
