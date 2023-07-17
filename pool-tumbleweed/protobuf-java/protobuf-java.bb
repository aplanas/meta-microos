SUMMARY = "Java Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Java bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "protobuf-java-23.4-6.1.aarch64.rpm"
RPM_HASH = "94ab6ffb9b3431d691fb7655932fa15b5279e07f09557e27503d8d5f2f2af55a346be547bcbf7afc56f01af04a87b7307dec35e6b6d6bb94952a186446a7d53f"

RPROVIDES:${PN} += "mvn-com.google.protobuf-protobuf-bom-pom- \
mvn-com.google.protobuf-protobuf-java \
mvn-com.google.protobuf-protobuf-java-pom- \
mvn-com.google.protobuf-protobuf-parent-pom- \
protobuf-java"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
