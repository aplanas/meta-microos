SUMMARY = "Groovy JAR artifact"
DESCRIPTION = "This package contains Groovy JAR artifact."
LICENSE = "Apache-2.0"

PV = "1.8.9"

RPM_NAME = "groovy18-lib-1.8.9-7.8.noarch.rpm"
RPM_HASH = "032d96296b80af1dd82115bede2bd83e6ad31fc9dec76c02721d6e696bd0579600259a00da3de7fc573ad2789a0bec64a514ea3759784a713a0b309515489350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groovy18-lib \
mvn-org.codehaus.groovy-groovy-1.8 \
mvn-org.codehaus.groovy-groovy-1.8.9 \
mvn-org.codehaus.groovy-groovy-all-1.8 \
mvn-org.codehaus.groovy-groovy-all-1.8.9 \
mvn-org.codehaus.groovy-groovy-all-pom-1.8 \
mvn-org.codehaus.groovy-groovy-all-pom-1.8.9 \
mvn-org.codehaus.groovy-groovy-pom-1.8 \
mvn-org.codehaus.groovy-groovy-pom-1.8.9"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-antlr-antlr \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util"

inherit rpm
