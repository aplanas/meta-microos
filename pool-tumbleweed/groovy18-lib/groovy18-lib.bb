SUMMARY = "Groovy JAR artifact"
DESCRIPTION = "This package contains Groovy JAR artifact."
LICENSE = "Apache-2.0"

PV = "1.8.9"

RPM_NAME = "groovy18-lib-1.8.9-7.7.noarch.rpm"
RPM_HASH = "7a987076b08a8c75d3b6db06eaaa44b4d10645817864ff4eb50ed7252bdd6ea034efff7da88f695b0f544cea4b733093ed6b1a4794f511861ed3e7c4e69c1592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groovy18-lib \
mvn(org.codehaus.groovy:groovy-all:1.8) \
mvn(org.codehaus.groovy:groovy-all:1.8.9) \
mvn(org.codehaus.groovy:groovy-all:pom:1.8) \
mvn(org.codehaus.groovy:groovy-all:pom:1.8.9) \
mvn(org.codehaus.groovy:groovy:1.8) \
mvn(org.codehaus.groovy:groovy:1.8.9) \
mvn(org.codehaus.groovy:groovy:pom:1.8) \
mvn(org.codehaus.groovy:groovy:pom:1.8.9)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(antlr:antlr) \
mvn(org.ow2.asm:asm) \
mvn(org.ow2.asm:asm-analysis) \
mvn(org.ow2.asm:asm-commons) \
mvn(org.ow2.asm:asm-tree) \
mvn(org.ow2.asm:asm-util)"

inherit rpm
