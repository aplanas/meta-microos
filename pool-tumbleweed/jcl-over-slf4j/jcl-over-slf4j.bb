SUMMARY = "JCL 1.1.1 implemented over SLF4J"
DESCRIPTION = "JCL 1.1.1 implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "jcl-over-slf4j-1.7.36-4.1.noarch.rpm"
RPM_HASH = "91584284ee1e3a1b84da083e2ac9a0a1bd54e0c364d3c4f37906ef917cab41ce247af0818298d176ed350a839a8a0064ab34c4270f43cb44c95c10966fe8e8bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcl-over-slf4j \
mvn(org.slf4j:jcl-over-slf4j) \
mvn(org.slf4j:jcl-over-slf4j:pom:) \
osgi(jcl.over.slf4j)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.slf4j:slf4j-api)"

inherit rpm
