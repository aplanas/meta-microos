SUMMARY = "Contract API for template resolvers"
DESCRIPTION = "Contract API for template resolvers."
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "template-resolver-0.1-2.7.noarch.rpm"
RPM_HASH = "206525d7751a641f5b12ba4470e31805974392b718b6970290a53bd18ad0e3ad0be6d8c3bd1a91a41d8a6ec751cc3cbdadd6a3055ba2de27e5bda88959af1caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-template-resolver \
mvn-org.scala-sbt-template-resolver-pom- \
template-resolver"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
