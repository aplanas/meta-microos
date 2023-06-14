SUMMARY = "Java library for Markdown processing"
DESCRIPTION = "A pure-Java Markdown processor based on a parboiled PEG parser \
supporting a number of extensions."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "pegdown-1.4.2-2.6.noarch.rpm"
RPM_HASH = "e7e9b0f803f93eaadf3d408d0d4844cacc935cb94ab1acd44384bb3cdbf72d8eca1e4ef19bd6306114f7281bca6b5530b664842e615754953d506504ea8ebf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.pegdown-pegdown \
mvn-org.pegdown-pegdown-pom- \
osgi-org.pegdown \
pegdown"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.parboiled-parboiled-java"

inherit rpm
