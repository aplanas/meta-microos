SUMMARY = "OpenJDK 15 Development Environment"
DESCRIPTION = "The OpenJDK 15 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-devel-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "e63da16e5111663de6eff4697a01585d667f73e3465258e05392999c898a6312d1e7397c88ce9212d0f0536fdad401a067034aaad7cb288e78df221149b61425"

RPROVIDES:${PN} += "java-15-devel \
java-15-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-15 \
java-sdk-15-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-15-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libstdc++.so.6 \
update-alternatives"

inherit rpm
