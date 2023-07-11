SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-devel-11.0.19.0-1.2.aarch64.rpm"
RPM_HASH = "a29093ee72e2ad5e58ae9db0b829c7f63e988220e4becdc2325b0d575b6cdb41e0a8efebc5422d80435b389e941168f68de900b873ff8efcd51baf3cccf5f2e0"

RPROVIDES:${PN} += "java-10-openjdk-devel \
java-11-devel \
java-11-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-11 \
java-sdk-11-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-11-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so \
update-alternatives"

inherit rpm
