SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "6.2.1"

RPM_NAME = "bazel6-6.2.1-1.1.aarch64.rpm"
RPM_HASH = "3bcb98dab31625923cc28e4fa7081fe38fca640b1622db0bcdce7e26ab975e24a4a1f9e3016bbf81d35c31b04d25e6be5f3c3f467e47c2c9c8275836262cf21d"

RPROVIDES:${PN} += "bazel \
bazel6"

RDEPENDS:${PN} += "/usr/bin/sh \
java-11-openjdk-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
