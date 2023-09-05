SUMMARY = "Pure Java access to native libraries"
DESCRIPTION = "JNA provides Java programs easy access to native shared libraries \
(DLLs on Windows) without writing anything but Java code. JNA's \
design aims to provide native access in a natural way with a \
minimum of effort. No boilerplate or generated code is required. \
While some attention is paid to performance, correctness and ease \
of use take priority."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "jna-5.13.0-1.1.aarch64.rpm"
RPM_HASH = "44cd0c48e05311725d0d9d828a47dc11a32c98515954a09e6c49d71eb139820a7448451e14c7b32af0c98edf70e9e568cb9b5b9a92e7929193e1f699675a3f89"

RPROVIDES:${PN} += "jna \
jna-native \
libjnidispatch \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-jna-jpms \
mvn-net.java.dev.jna-jna-jpms-pom- \
mvn-net.java.dev.jna-jna-pom- \
osgi-com.sun.jna"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
