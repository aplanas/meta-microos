SUMMARY = "OpenJDK 8 Development Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 8 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openj9-devel-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "7149f21834e9bc9c9cbd1514d9ccc2ea63f39b0d0d6cf5bb73b87729a6fb5f40c0905d20e9de521ad17686669e7fe1b5ad49191d9e1e83f284df7c1cb2a4c634"

RPROVIDES:${PN} += "java-1-8-0-openj9-devel \
java-1.8.0-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openj9 \
java-sdk-1.8.0-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libjawt.so \
libjli.so \
libunpack.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openj9 \
ld-linux-aarch64.so.1 \
libawt-xawt.so \
libc.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
