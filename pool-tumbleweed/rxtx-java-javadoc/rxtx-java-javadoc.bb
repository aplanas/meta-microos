SUMMARY = "Javadocs for rxtx-java"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "rxtx-java-javadoc-2.2~pre2-5.1.noarch.rpm"
RPM_HASH = "cfe973772ded492b148f44aad478fa1472a8338c1f6e837d45608059dafbb7a05cd2f600ac69ac5fee85dd05df5a51c03bb3ef8b01458ac7ba92e92e9a5abb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rxtx-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
