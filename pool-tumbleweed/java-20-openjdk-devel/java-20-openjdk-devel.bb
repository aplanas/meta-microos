SUMMARY = "OpenJDK 20 Development Environment"
DESCRIPTION = "The OpenJDK 20 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-devel-20.0.1.0-1.2.aarch64.rpm"
RPM_HASH = "fa571c7f7e88a4b182ce181949d2b788da41506f8f07d01117b35a0e24fd86da82e81ca6717d8db7dd5117850d14b96b40d6b9ba9c03e6fca8e5c6f9550aee49"

RPROVIDES:${PN} += "java-20-devel \
java-20-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-20 \
java-sdk-20-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-20-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libstdc++.so.6 \
update-alternatives"

inherit rpm
