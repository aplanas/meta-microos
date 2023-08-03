SUMMARY = "OpenJDK 8 Demos"
DESCRIPTION = "The OpenJDK 8 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openjdk-demo-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "a783d3719b99246966c8001c47ddc967fdbff342444d7289512ce267d205ce2ec157a84d390f284130a8ef584f248a55c2207f2144e30689d9d27bea57755405"

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
