SUMMARY = "OpenJDK 8 Demos"
DESCRIPTION = "The OpenJDK 8 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openj9-demo-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "699554448ff8d17746e63052d4ecdadcf64327f23c311d696ee4c9108a1c8d0d36498999480b2c1c2f458c641513797cabb742072b13e8cdcaeefd63b904bb5e"

RPROVIDES:${PN} += "java-1-8-0-openj9-demo \
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
java-1-8-0-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
