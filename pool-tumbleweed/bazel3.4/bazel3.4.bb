SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "bazel3.4-3.4.1-3.9.aarch64.rpm"
RPM_HASH = "89ba722dbc9b254e66be6d2ccf126eb7784ae6168c2c1e7a7227bcae4669a47eacec5d63febbe058cb62e40fa4066720d47850378ee99a54070f00c04d04515e"

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
