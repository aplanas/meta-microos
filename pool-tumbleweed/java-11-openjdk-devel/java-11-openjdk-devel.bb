SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-devel-11.0.20.0-1.1.aarch64.rpm"
RPM_HASH = "ea52321917063df46a9c1db2dba9bb28d600594163a3ccb55ea9106038b2ba1b761cefe952c458731f1d8ff2eaffd5b51d188076af4e94f17e65b8d6057b3d26"

RPROVIDES:${PN} += "java-10-openjdk-devel \
java-11-devel \
java-11-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-11 \
java-sdk-11-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-11-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so \
update-alternatives"

inherit rpm
