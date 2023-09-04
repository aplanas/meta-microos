SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openj9-devel-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "8dc07f890da1676095c4e08a4a4923085cf5c2ba3e13e5061e3eca889709464400c7d2d6ac8c468888767258ff6e66a1e2bf01c76c4ca29730a8ae40a468be62"

RPROVIDES:${PN} += "java-11-devel \
java-11-openj9-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-11 \
java-sdk-11-openj9 \
java-sdk-11-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-11-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so \
update-alternatives"

inherit rpm
