SUMMARY = "Pure Java access to native libraries"
DESCRIPTION = "JNA provides Java programs easy access to native shared libraries \
(DLLs on Windows) without writing anything but Java code. JNA's \
design aims to provide native access in a natural way with a \
minimum of effort. No boilerplate or generated code is required. \
While some attention is paid to performance, correctness and ease \
of use take priority."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "jna-5.5.0-3.7.aarch64.rpm"
RPM_HASH = "0a9516540823681d2b2ea79d387375f529f2bbabddddc1bd174dbdce3561d64862ae5c8e655c74385b66c9d5c08f45e77726d7937e3b898452b3d73cf4a3b67c"

RPROVIDES:${PN} += "jna \
jna-native \
libjnidispatch \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-jna-pom- \
osgi-com.sun.jna"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
