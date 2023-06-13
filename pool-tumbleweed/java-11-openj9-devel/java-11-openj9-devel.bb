SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-devel-11.0.18.0-2.1.aarch64.rpm"
RPM_HASH = "4bb1f5d11d6110f9647d8840aacf11459cbcbe652d79a98b98cc5a0735015e805b09e324a3209a67efaba7fbe9eb5aa0233cc7ed2bc8270d74a7fc3da4b4ccdd"

RPROVIDES:${PN} += "java-11-devel \
java-11-openj9-devel \
java-11-openj9-devel(aarch-64) \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-11 \
java-sdk-11-openj9 \
java-sdk-11-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
java-11-openj9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjava.so()(64bit) \
libjli.so()(64bit) \
update-alternatives"

inherit rpm
