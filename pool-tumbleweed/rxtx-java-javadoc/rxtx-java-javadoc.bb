SUMMARY = "Javadocs for rxtx-java"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "rxtx-java-javadoc-2.2~pre2-4.3.noarch.rpm"
RPM_HASH = "9e779285d4cc5baf29be722218e8b031b9cbe9368145c33f6fc8c86cbdd6c8e87f0ed8e41d5cbe0fe8b7cb6a9d7986f2431ffdcfaf980ccfea93a65969261d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rxtx-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
