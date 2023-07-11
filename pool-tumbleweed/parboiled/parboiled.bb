SUMMARY = "Java/Scala library providing parsing of input text based on PEGs"
DESCRIPTION = " \
 \
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

RPM_NAME = "parboiled-1.1.6-5.7.noarch.rpm"
RPM_HASH = "18bb966ff7c6803c6b9f2ad3fa9c195d095944187e3fb5c39e115cf733c2f2994aed1657650cd23d763c7025a837218caa27c9f35a9f470e2d52b12ecae6de19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.parboiled-parboiled-core \
mvn-org.parboiled-parboiled-core-pom- \
mvn-org.parboiled-parboiled-java \
mvn-org.parboiled-parboiled-java-pom- \
osgi-org.parboiled.core \
osgi-org.parboiled.java \
parboiled"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util"

inherit rpm
