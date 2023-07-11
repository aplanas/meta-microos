SUMMARY = "Full Java CommAPI implementation"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "rxtx-java-2.2~pre2-5.1.aarch64.rpm"
RPM_HASH = "02529194c1961cbbdc084ecedebf2ddbbce879a42028594d4f61f1f243f861eba232b841ff2b333ed6ee30dd285d096c0c3c9d6929e43c6823fe85ccd10e6824"

RPROVIDES:${PN} += "osgi-gnu.io.rxtx \
rxtx-java"

RDEPENDS:${PN} += "librxtx2"

inherit rpm
