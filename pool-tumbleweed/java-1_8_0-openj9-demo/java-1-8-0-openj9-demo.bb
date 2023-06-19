SUMMARY = "OpenJDK 8 Demos"
DESCRIPTION = "The OpenJDK 8 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-demo-1.8.0.362-2.1.aarch64.rpm"
RPM_HASH = "0e70eafbc4cb844a2b697ac114bbcf0ff4d860e2ceb7fd43e97fd06a62509e1a7fbe9a64136e825b185029e952b0076f1d90928b2f5c05b2a0edd870c07710ab"

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
