SUMMARY = "High Performance Primitive Collections for Java"
DESCRIPTION = "Fundamental data structures (maps, sets, lists, stacks, queues) generated for \
combinations of object and primitive types to conserve JVM memory and speed \
up execution."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-0.7.1-3.10.noarch.rpm"
RPM_HASH = "1f61fa704ac7e03b06f86b4b6a04b7c8b4f3faac4ae65827ee505b9d07d9efe1d995fc9f16540f1d41ca84d0974961e7f28914a7d5ef82b2affe9e067119273c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc \
mvn(com.carrotsearch:hppc) \
mvn(com.carrotsearch:hppc-parent:pom:) \
mvn(com.carrotsearch:hppc::esoteric:) \
mvn(com.carrotsearch:hppc:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.annotation:javax.annotation-api)"

inherit rpm
