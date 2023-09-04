SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "6.3.1"

RPM_NAME = "bazel6-6.3.1-1.1.aarch64.rpm"
RPM_HASH = "534e19086997f4e81ed5b50c1307bde2a2ca09e7d8087e95a5a92d36d1b6e57167c33c0eeb35b517d4c0f715afe74fbd0afa1f2405fe49f2568a4e9e1e42812b"

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
