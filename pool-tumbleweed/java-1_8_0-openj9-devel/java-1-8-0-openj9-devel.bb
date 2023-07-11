SUMMARY = "OpenJDK 8 Development Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 8 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-devel-1.8.0.362-2.3.aarch64.rpm"
RPM_HASH = "758cec7d957bb621e06ad3f5243084b4868d6d76c08c8ae0687d6d7d7df8d7e383a40c454e52e6d746c14cd68f2c0d8115ef1d9f70540661ba5e2862a8a66f75"

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
