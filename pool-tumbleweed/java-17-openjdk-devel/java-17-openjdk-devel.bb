SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openjdk-devel-17.0.8.0-1.1.aarch64.rpm"
RPM_HASH = "879155e79e86edbc607f0034d1655452cfb26fe36de04ec87aa7220cc8ad24e5468ceb7fb7104f544bfe8a766e813c2a6af25ce88f30cfb7b771289b20f0d39e"

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
