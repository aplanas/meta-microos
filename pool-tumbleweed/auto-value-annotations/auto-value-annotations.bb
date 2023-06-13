SUMMARY = "Auto Value Annotations"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-annotations-1.6.1-1.10.noarch.rpm"
RPM_HASH = "533c421c7a4ed130662f410d0e2337916a596899c2c5759c0bc413f22a7b297c3b5002db912b3c7dac0e929087ef94ab9ef924dd67dc9c8183c38d71dd61b9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value-annotations \
mvn(com.google.auto.value:auto-value-annotations) \
mvn(com.google.auto.value:auto-value-annotations:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
