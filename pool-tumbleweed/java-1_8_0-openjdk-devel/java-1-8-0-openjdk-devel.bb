SUMMARY = "OpenJDK 8 Development Environment"
DESCRIPTION = "The OpenJDK 8 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openjdk-devel-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "c7c605889ac17dd4626998f8d179f6eef1f7275db35399eac3d79d67f1c0a06a193e69c8a2a9293ce765348d37467b3607073ccf31bc9f75762604faa70fd438"

RPROVIDES:${PN} += "java-1-8-0-openjdk-devel \
java-1.8.0-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openjdk \
java-sdk-openjdk \
libjawt.so \
libjli.so \
libunpack.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk \
ld-linux-aarch64.so.1 \
libawt-xawt.so \
libc.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
