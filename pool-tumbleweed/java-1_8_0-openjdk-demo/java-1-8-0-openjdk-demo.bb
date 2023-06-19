SUMMARY = "OpenJDK 8 Demos"
DESCRIPTION = "The OpenJDK 8 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-demo-1.8.0.372-1.1.aarch64.rpm"
RPM_HASH = "d20ffe2fc2248fd0c2d4370fb79fba6b4ee6754449b78e69ddb346b60b9afbcf78cded8a9a096642f5dd15490a155af81cf7e54f936676404b0b4a644e390087"

RPROVIDES:${PN} += "java-1-8-0-openjdk-demo \
libcompiledMethodLoad.so \
libgctest.so \
libheapTracker.so \
libheapViewer.so \
libhprof.so \
libminst.so \
libmtrace.so \
libversionCheck.so \
libwaiters.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
