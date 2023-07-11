SUMMARY = "Javadoc for disruptor"
DESCRIPTION = "This package contains javadoc for disruptor."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-javadoc-3.4.4-1.13.noarch.rpm"
RPM_HASH = "414591945669e28f994e79268df6c3ddd8dd2363aa9c5591e12251f9719a4d7168845f4667295ce90500ef69c931d9479f63a37248f6df116e2ac3264c4d97d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
