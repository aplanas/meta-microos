SUMMARY = "Java Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Java bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "23.3"

RPM_NAME = "protobuf-java-23.3-5.1.aarch64.rpm"
RPM_HASH = "43adef4a506675037fcdaa3f2e84ccdd2629264863b1b33ea999ab6869d9cca45ab9830bdfe815d518183845b1f4a425427b5488315b71a08bf83cc7befb5ab2"

RPROVIDES:${PN} += "mvn-com.google.protobuf-protobuf-bom-pom- \
mvn-com.google.protobuf-protobuf-java \
mvn-com.google.protobuf-protobuf-java-pom- \
mvn-com.google.protobuf-protobuf-parent-pom- \
protobuf-java"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
