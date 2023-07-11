SUMMARY = "Auto Value"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-1.6.1-1.11.noarch.rpm"
RPM_HASH = "e350f957241eaa4a2870fafb8a56d0eb45622df89187cb748950263522fe0a23b03310025f6cb159eef2bc79c8520105ccd7f668571bfbeadc1d0ef48b89d2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value \
mvn-com.google.auto.value-auto-value \
mvn-com.google.auto.value-auto-value-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto-auto-common \
mvn-com.google.guava-guava \
mvn-com.squareup-javapoet"

inherit rpm
