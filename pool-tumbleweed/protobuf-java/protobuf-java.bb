SUMMARY = "Java Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Java bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "protobuf-java-23.4-6.2.aarch64.rpm"
RPM_HASH = "c11b9c6cc18d247b248723badcb11af8f115c1068502ff5746f40ed66e27dd3fb6985159e83a5080c1b2c965ce25cdae63d62afe7004057bff5de65f032283df"

RPROVIDES:${PN} += "mvn-com.google.protobuf-protobuf-bom-pom- \
mvn-com.google.protobuf-protobuf-java \
mvn-com.google.protobuf-protobuf-java-pom- \
mvn-com.google.protobuf-protobuf-parent-pom- \
protobuf-java"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
