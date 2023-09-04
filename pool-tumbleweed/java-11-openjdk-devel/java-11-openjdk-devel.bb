SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openjdk-devel-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "cc4f7a063f30def8b9c8e0eb79630fd08ea32281cbd0c3b5de64fae4e0366d8643e5c61edbfadf67fb6e0c3633ad3d84fc72d20cc26b8627e3557a628d67cc03"

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
