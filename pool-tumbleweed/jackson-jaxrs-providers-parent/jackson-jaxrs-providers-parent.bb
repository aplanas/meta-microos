SUMMARY = "Parent for Jackson JAX-RS providers"
DESCRIPTION = "Parent POM for Jackson JAX-RS providers."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-parent-2.15.2-1.1.noarch.rpm"
RPM_HASH = "68b3e2a4504f3f4afca1c8f0261522ccab1102135ca6a3257c268e9ef0b33304e95a1b646fc54951bc495af185e08e510b85c65a835d2137561bc6cd40b0ff14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-parent \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-providers-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
