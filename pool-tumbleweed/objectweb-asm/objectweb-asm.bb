SUMMARY = "Java bytecode manipulation framework"
DESCRIPTION = "ASM is a Java bytecode manipulation framework. \
 \
It can be used to dynamically generate stub classes or other proxy \
classes, directly in binary form, or to dynamically modify classes at \
load time, i.e., just before they are loaded into the Java Virtual \
Machine. \
 \
ASM offers similar functionalities as BCEL or SERP, but is much \
smaller."
LICENSE = "BSD-3-Clause"

PV = "9.5"

RPM_NAME = "objectweb-asm-9.5-1.2.noarch.rpm"
RPM_HASH = "3a0c7b7db938a41585a594474e8ad416d13806c8cd57396c227e320d286a1c109f1e87fa15d8ca89ede69eb57af2dacb9affc4dc53c46fec0562511609cd05ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-all \
mvn-org.ow2.asm-asm-all-pom- \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-analysis-pom- \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-commons-pom- \
mvn-org.ow2.asm-asm-debug-all \
mvn-org.ow2.asm-asm-debug-all-pom- \
mvn-org.ow2.asm-asm-pom- \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-tree-pom- \
mvn-org.ow2.asm-asm-util \
mvn-org.ow2.asm-asm-util-pom- \
objectweb-asm \
osgi-org.objectweb.asm \
osgi-org.objectweb.asm.analysis \
osgi-org.objectweb.asm.commons \
osgi-org.objectweb.asm.tree \
osgi-org.objectweb.asm.util"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
