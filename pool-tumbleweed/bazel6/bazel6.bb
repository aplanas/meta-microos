SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "6.1.2"

RPM_NAME = "bazel6-6.1.2-1.1.aarch64.rpm"
RPM_HASH = "b8fad701184a11290f227f2416217cc5b945c2881db2abc644e2a27cc61306f7cc47a282392516da4d03b0e0d8f104e44af8f5fc5e1bef5a404d610bdcad0e8e"

RPROVIDES:${PN} += "bazel \
bazel6"

RDEPENDS:${PN} += "/bin/sh \
java-11-openjdk-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
