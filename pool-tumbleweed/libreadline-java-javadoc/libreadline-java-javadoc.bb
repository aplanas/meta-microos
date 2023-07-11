SUMMARY = "Javadoc for libreadline-java"
DESCRIPTION = "libreadline-java provides Java bindings for libedit though a JNI \
wrapper. This package contains the javadoc documentation for it."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libreadline-java-javadoc-0.8.3-1.5.aarch64.rpm"
RPM_HASH = "f17fe7f01a1922e04a33fa17a97ba74a9fafab9ae6b97cfd2a179427cd7ab99c586b84b33322fdcf5091c690780cfa6df7cd6648d1906df84019d4ef3633dc8d"

RPROVIDES:${PN} += "libreadline-java-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
