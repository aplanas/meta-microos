SUMMARY = "Pure Java access to native libraries"
DESCRIPTION = "JNA provides Java programs easy access to native shared libraries \
(DLLs on Windows) without writing anything but Java code. JNA's \
design aims to provide native access in a natural way with a \
minimum of effort. No boilerplate or generated code is required. \
While some attention is paid to performance, correctness and ease \
of use take priority."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "jna-5.5.0-3.6.aarch64.rpm"
RPM_HASH = "d20ebd38db57d87853d9706a41e864f9f41f238fcf8e7b0a79928a7628a973d1b6650f1cd482ba151cda8aef0e891a15b8ad6390c2097467abe2e22e94b43fb4"

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
