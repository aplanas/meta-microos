SUMMARY = "HK2 Maven Plug-ins"
DESCRIPTION = "This package provides various maven plug-ins: \
* consolidatedbundle-maven-plugin \
* osgiversion-maven-plugin \
* hk2-inhabitant-generator"
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-maven-plugins-2.5.0-2.3.noarch.rpm"
RPM_HASH = "10d590611efdcdecc0d6402a5d62330487b5e90d40a0dc551b89350c3c9e0f24ec41095c7c18f9f33e5b9ff3fa9d40fb2189fe912fed02f616b1c44bad4e4404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-inhabitant-generator \
glassfish-hk2-maven \
glassfish-hk2-maven-plugins \
mvn(org.glassfish.hk2:consolidatedbundle-maven-plugin) \
mvn(org.glassfish.hk2:consolidatedbundle-maven-plugin:pom:) \
mvn(org.glassfish.hk2:hk2-inhabitant-generator) \
mvn(org.glassfish.hk2:hk2-inhabitant-generator:pom:) \
mvn(org.glassfish.hk2:maven-plugins:pom:) \
mvn(org.glassfish.hk2:osgiversion-maven-plugin) \
mvn(org.glassfish.hk2:osgiversion-maven-plugin:pom:) \
osgi(org.glassfish.hk2.inhabitant-generator)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.inject:javax.inject) \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache.maven.shared:maven-osgi) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.glassfish.hk2:hk2-api) \
mvn(org.glassfish.hk2:hk2-core) \
mvn(org.ow2.asm:asm-all)"

inherit rpm
