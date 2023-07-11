SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "bazel3.4-3.4.1-3.10.aarch64.rpm"
RPM_HASH = "c9088e4fb0d7e02f1184dbf697917c87799c83fbf70b7ab7950dbff816f02411fd476f90b239d25656880a94ff94df68de6fae80f5bada2f5afbd63b90292deb"

RPROVIDES:${PN} += "bazel \
bazel3.4"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
