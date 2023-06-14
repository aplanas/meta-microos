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

RPM_NAME = "parboiled-scala-1.1.6-5.6.noarch.rpm"
RPM_HASH = "2ccbcf97e5b748752d2ab890a9a150b788d0032dba99e0523202a41ede43e1b3e0edb0f4c3db1c74b123046dd7c135693ddd0d92c40ee386718cc15fbd0230d3"
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
