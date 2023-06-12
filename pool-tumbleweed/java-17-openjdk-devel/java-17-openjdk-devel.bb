SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-devel-17.0.7.0-3.1.aarch64.rpm"
RPM_HASH = "098d197226b44457b74f1e6667bdf6bf3f927553624be713838dd167270055dc197d03d754d839c79152f3e35f5a7c5a99170e6289962ad87faf7c15f55c6beb"

RPROVIDES:${PN} += "java-17-devel \
java-17-openjdk-devel \
java-17-openjdk-devel(aarch-64) \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-17 \
java-sdk-17-openjdk \
java-sdk-openjdk \
libattach.so()(64bit) \
libsaproc.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
java-17-openjdk \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libjava.so()(64bit) \
libjli.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
update-alternatives"

inherit rpm
