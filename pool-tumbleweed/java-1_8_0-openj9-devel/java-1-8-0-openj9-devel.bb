SUMMARY = "OpenJDK 8 Development Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 8 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-devel-1.8.0.362-2.1.aarch64.rpm"
RPM_HASH = "8db2fb1878de66bd52379fba3db0fd38dde44d6b1392a9586e7810a9c713a847bb2e2cb03f2426a014852b178337fa9aea1eece2edaac570f708a568b63d2e72"

RPROVIDES:${PN} += "java-1.8.0-devel \
java-1_8_0-openj9-devel \
java-1_8_0-openj9-devel(aarch-64) \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openj9 \
java-sdk-1.8.0-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libjawt.so()(64bit) \
libjli.so()(64bit) \
libunpack.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
java-1_8_0-openj9 \
ld-linux-aarch64.so.1()(64bit) \
libawt_xawt.so()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
