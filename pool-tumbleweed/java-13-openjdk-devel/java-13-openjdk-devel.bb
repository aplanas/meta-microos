SUMMARY = "OpenJDK 13 Development Environment"
DESCRIPTION = "The OpenJDK 13 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-devel-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "264846d1ac02edb507d2d9617290c33854e18aa28901e95e8094b0708dcdb902f387a2b32397a93902986a1de07749280eca9fd2f792f2fcbc7fdfc84b83b1fe"

RPROVIDES:${PN} += "java-13-devel \
java-13-openjdk-devel \
java-13-openjdk-devel(aarch-64) \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-13 \
java-sdk-13-openjdk \
java-sdk-openjdk \
libattach.so()(64bit) \
libsaproc.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
java-13-openjdk \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjava.so()(64bit) \
libjli.so()(64bit) \
update-alternatives"

inherit rpm
