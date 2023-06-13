SUMMARY = "OpenJDK 18 Development Environment"
DESCRIPTION = "The OpenJDK 18 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-devel-18.0.2.0-4.3.aarch64.rpm"
RPM_HASH = "6fa03a30881b35a63a6745e54fa9c60a2c374632072bec1669eab86fe7ba353041c8cc8297003555ede1147c8bf250b1ab14705281641a317cc9ee932eb503e0"

RPROVIDES:${PN} += "java-18-devel \
java-18-openjdk-devel \
java-18-openjdk-devel(aarch-64) \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-18 \
java-sdk-18-openjdk \
java-sdk-openjdk \
libattach.so()(64bit) \
libsaproc.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
java-18-openjdk \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjava.so()(64bit) \
libjli.so()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
