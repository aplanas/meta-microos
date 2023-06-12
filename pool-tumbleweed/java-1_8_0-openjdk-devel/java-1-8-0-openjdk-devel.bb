SUMMARY = "OpenJDK 8 Development Environment"
DESCRIPTION = "The OpenJDK 8 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-devel-1.8.0.372-1.1.aarch64.rpm"
RPM_HASH = "c77a52f413ca6c4379f3f15a67048991f09b91a26b6f1f34a989632f8ea1357afd713ce699f31d3669733ac720f238721fe4ba49bde2715af7b8abf696e36566"

RPROVIDES:${PN} += "java-1.8.0-devel \
java-1_8_0-openjdk-devel \
java-1_8_0-openjdk-devel(aarch-64) \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openjdk \
java-sdk-openjdk \
libjawt.so()(64bit) \
libjawt.so(SUNWprivate_1.1)(64bit) \
libjli.so()(64bit) \
libjli.so(SUNWprivate_1.1)(64bit) \
libunpack.so(SUNWprivate_1.1)(64bit)"
RDEPENDS:${PN} += "/bin/sh \
java-1_8_0-openjdk \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libawt_xawt.so()(64bit) \
libawt_xawt.so(SUNWprivate_1.1)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm