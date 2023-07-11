SUMMARY = "Parboiled for Scala"
DESCRIPTION = " \
An internal Scala DSL for efficiently defining your parser rules. \
 \
 \
parboiled is a mixed Java/Scala library providing parsing of \
arbitrary input text based on Parsing expression grammars (PEGs). \
PEGs are an alternative to context free grammars (CFGs) for formally \
specifying syntax, they make a replacement for regular expressions \
and generally have some advantages over the 'traditional' way of \
building parser via CFGs."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "parboiled-scala-1.1.6-5.7.noarch.rpm"
RPM_HASH = "307211fc77293789befd3f9de4218e3cc1b584e324d01c89dde52cfe2f5e91476efa93d3043b9ab8698d8aeefc82f88c6f46c0fc267e9b998d5eebcb33ae3e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.parboiled-parboiled-scala-2.10 \
mvn-org.parboiled-parboiled-scala-2.10-pom- \
osgi-org.parboiled.scala \
parboiled-scala"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.parboiled-parboiled-core \
mvn-org.scala-lang-scala-library"

inherit rpm
