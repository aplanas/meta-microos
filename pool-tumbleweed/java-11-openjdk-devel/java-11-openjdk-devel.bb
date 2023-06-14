SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-devel-11.0.19.0-1.1.aarch64.rpm"
RPM_HASH = "d9f28dca9f18109d5d96190aeda3fe131a5b643695798d98c7ecbfa1453f9a5ab8cabb767dec61bc125819e777d6ac175729a33590c7a18233a6e7dbdead6655"

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

RDEPENDS:${PN} += "/bin/sh \
java-11-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so \
update-alternatives"

inherit rpm
