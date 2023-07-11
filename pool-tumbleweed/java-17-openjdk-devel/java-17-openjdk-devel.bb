SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-devel-17.0.7.0-3.2.aarch64.rpm"
RPM_HASH = "5e99ebaf00a78a8c23162f100865c6998f18a5e182c2bd86f3fcd4c7abb06994a6761f3e7581d9f01872d4f928347fe329bd5de5b3500fcd0c072b29882d36bd"

RPROVIDES:${PN} += "java-17-devel \
java-17-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-17 \
java-sdk-17-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-17-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libstdc++.so.6 \
update-alternatives"

inherit rpm
