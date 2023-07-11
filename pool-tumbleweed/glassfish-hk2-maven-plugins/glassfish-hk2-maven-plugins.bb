SUMMARY = "HK2 Maven Plug-ins"
DESCRIPTION = "This package provides various maven plug-ins: \
* consolidatedbundle-maven-plugin \
* osgiversion-maven-plugin \
* hk2-inhabitant-generator"
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-maven-plugins-2.5.0-2.4.noarch.rpm"
RPM_HASH = "c41c1a7a79ca36caef54f13dddaf322887e573811d0fa7681bca780f5e9e34c024fb771a5e98b0ebe2bec059b676b3dd7dcd4ac7e0a4613905a94006d6f11456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-inhabitant-generator \
glassfish-hk2-maven \
glassfish-hk2-maven-plugins \
mvn-org.glassfish.hk2-consolidatedbundle-maven-plugin \
mvn-org.glassfish.hk2-consolidatedbundle-maven-plugin-pom- \
mvn-org.glassfish.hk2-hk2-inhabitant-generator \
mvn-org.glassfish.hk2-hk2-inhabitant-generator-pom- \
mvn-org.glassfish.hk2-maven-plugins-pom- \
mvn-org.glassfish.hk2-osgiversion-maven-plugin \
mvn-org.glassfish.hk2-osgiversion-maven-plugin-pom- \
osgi-org.glassfish.hk2.inhabitant-generator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.shared-maven-osgi \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-core \
mvn-org.ow2.asm-asm-all"

inherit rpm
