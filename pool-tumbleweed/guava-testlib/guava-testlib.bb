SUMMARY = "The guava-testlib artifact"
DESCRIPTION = "guava-testlib provides additional functionality for conveninent unit testing"
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "32.0.1"

RPM_NAME = "guava-testlib-32.0.1-1.1.noarch.rpm"
RPM_HASH = "d6f94aaf6dfbc2a0340e3dffba7cb03f6b642c42c20fc51c09f0f25c90314a09dfe9de548d17bd4f3f913c8229bb6da50cd4f7d10ca00cd40166f09150283e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava-testlib \
mvn-com.google.guava-guava-testlib \
mvn-com.google.guava-guava-testlib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.guava-guava \
mvn-junit-junit"

inherit rpm
