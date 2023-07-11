SUMMARY = "Full Java CommAPI implementation native library"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "librxtx2-2.2~pre2-5.1.aarch64.rpm"
RPM_HASH = "2114d8d3d930879ba8f0abfe57e7938e8fe2c5693d888bb7af3930649af9dd486cd43e3d247bf429a1886280adb53d7041a1335bb9c15b6e82d230e674b0ce47"

RPROVIDES:${PN} += "librxtx2 \
librxtxI2C-2.2pre2.so \
librxtxParallel-2.2pre2.so \
librxtxRS485-2.2pre2.so \
librxtxRaw-2.2pre2.so \
librxtxSerial-2.2pre2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
