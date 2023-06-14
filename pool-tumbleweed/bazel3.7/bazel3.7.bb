SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "3.7.2"

RPM_NAME = "bazel3.7-3.7.2-2.9.aarch64.rpm"
RPM_HASH = "18d86c5d1b5842097df14e844d8620959ce5264c9f4429446a8f8205f2324c6e03b33a1230883bfc1cb409c64148aa9d1a35a37805b6df9c0169414d170f91fc"

RPROVIDES:${PN} += "bazel \
bazel3.7"

RDEPENDS:${PN} += "/bin/sh \
java-1-8-0-openjdk-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
