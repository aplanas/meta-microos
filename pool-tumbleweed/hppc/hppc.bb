SUMMARY = "High Performance Primitive Collections for Java"
DESCRIPTION = "Fundamental data structures (maps, sets, lists, stacks, queues) generated for \
combinations of object and primitive types to conserve JVM memory and speed \
up execution."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-0.7.1-3.11.noarch.rpm"
RPM_HASH = "c85b1339d5ebc4d848404486aaf4ec84c62efc48749985eb3bb48cd0f463cf3bc287481856f67764aa7b77a47496c450d2d1b735b0bb4a0708772bfe4e942234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc \
mvn-com.carrotsearch-hppc \
mvn-com.carrotsearch-hppc--esoteric- \
mvn-com.carrotsearch-hppc-parent-pom- \
mvn-com.carrotsearch-hppc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api"

inherit rpm
