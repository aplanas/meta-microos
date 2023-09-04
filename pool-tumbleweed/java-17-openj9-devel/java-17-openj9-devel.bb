SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openj9-devel-17.0.8.0-2.1.aarch64.rpm"
RPM_HASH = "7dad2a4383728ab464c00a28743b1539629d955d5480102b6d81dda3023478c7e5078b61f74ac83714e27d6d29fcf871221829d630151b4de4ae043bab439d16"

RPROVIDES:${PN} += "java-17-devel \
java-17-openj9-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-17 \
java-sdk-17-openj9 \
java-sdk-17-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-17-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so \
update-alternatives"

inherit rpm
