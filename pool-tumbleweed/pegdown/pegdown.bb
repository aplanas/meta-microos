SUMMARY = "Java library for Markdown processing"
DESCRIPTION = "A pure-Java Markdown processor based on a parboiled PEG parser \
supporting a number of extensions."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "pegdown-1.4.2-2.7.noarch.rpm"
RPM_HASH = "8de082720471f796f4fae9cff8ef9bf4f3eaec114bc381dd1ea42bf8705917a20b73b6db0645e6dcb5751843b9607f2de6d3150eddc93d869291da8d541bf841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.pegdown-pegdown \
mvn-org.pegdown-pegdown-pom- \
osgi-org.pegdown \
pegdown"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.parboiled-parboiled-java"

inherit rpm
