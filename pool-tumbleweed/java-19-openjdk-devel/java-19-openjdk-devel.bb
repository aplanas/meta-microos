SUMMARY = "OpenJDK 19 Development Environment"
DESCRIPTION = "The OpenJDK 19 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "19.0.2.0"

RPM_NAME = "java-19-openjdk-devel-19.0.2.0-3.3.aarch64.rpm"
RPM_HASH = "1e4d038d179b1bf6711fa284a9083a2b808e52ededbfe193916059164d6d1d5ff4eb8615177976587db200f0f57d8557e2839d96ca2546eff4467f8d97d293f4"

RPROVIDES:${PN} += "java-19-devel \
java-19-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-19 \
java-sdk-19-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/bin/sh \
java-19-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libstdc++.so.6 \
update-alternatives"

inherit rpm
