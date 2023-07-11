SUMMARY = "OpenJDK 8 Development Environment"
DESCRIPTION = "The OpenJDK 8 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-devel-1.8.0.372-1.2.aarch64.rpm"
RPM_HASH = "910e8296dca7a6d374c3215a9b0f0a7f0e9207e128d8e2a32dcaf8506d18a9d86124883eb261bb23568f38ad9ec42aeedc241787d72e2ca8ad3568362b09f92b"

RPROVIDES:${PN} += "java-1-8-0-openjdk-devel \
java-1.8.0-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openjdk \
java-sdk-openjdk \
libjawt.so \
libjli.so \
libunpack.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk \
ld-linux-aarch64.so.1 \
libawt-xawt.so \
libc.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
