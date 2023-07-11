SUMMARY = "An API to analyse class dependencies"
DESCRIPTION = "jdependency is library that helps analyzing class level \
dependencies, clashes and missing classes."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "jdependency-1.2-4.7.noarch.rpm"
RPM_HASH = "a433fab32d0571c28bb7edb7690d04f052640f527addf5904b09aa184f0eb6ac9364fca11fc48217753d35f9f0f16289d9dea28d6cdb6b74e7ec4cfca06d5764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdependency \
mvn-org.vafer-jdependency \
mvn-org.vafer-jdependency-pom-"

RDEPENDS:${PN} += "apache-commons-io \
java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util \
objectweb-asm"

inherit rpm
