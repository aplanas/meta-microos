SUMMARY = "Full Java CommAPI implementation native library"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "librxtx2-2.2~pre2-4.3.aarch64.rpm"
RPM_HASH = "3c3d3766600b48651e48fd46cee94fa4ca66a835b48f97f025fa0d7fb679c86eb955d154114777713660cc07755cb01e0ec883e3ddb26c506cb3d9a0935ceea3"

RPROVIDES:${PN} += "librxtx2 \
librxtxI2C-2.2pre2.so \
librxtxParallel-2.2pre2.so \
librxtxRS485-2.2pre2.so \
librxtxRaw-2.2pre2.so \
librxtxSerial-2.2pre2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblockdev.so.1"

inherit rpm
