SUMMARY = "JCL 1.1.1 implemented over SLF4J"
DESCRIPTION = "JCL 1.1.1 implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "jcl-over-slf4j-1.7.36-4.2.noarch.rpm"
RPM_HASH = "8dfd804f13784f2e843fa68dbb084487c18ea8121e03113fc35346f1b883b99c02f38f68b1fa3016c046650c9a380eceea21aa24862ecaf505b8b8609aa2e7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcl-over-slf4j \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-jcl-over-slf4j-pom- \
osgi-jcl.over.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
