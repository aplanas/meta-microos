SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "3.7.2"

RPM_NAME = "bazel3.7-3.7.2-2.10.aarch64.rpm"
RPM_HASH = "507c2d9b2f68a4b2a28cbe18b5fb143619c00c5decf6b3536ae0c9d6ae4caccc36e932a22160722915a7780b6a1ce7c0a6c1ba93d638230c357747eafd24a413"

RPROVIDES:${PN} += "bazel \
bazel3.7"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
