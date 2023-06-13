SUMMARY = "XML-Java binding tool"
DESCRIPTION = "XMLBeans is an XML-Java binding tool that allows accessing XML in a \
Java-typical way. The features of XML and XML Schema are mapped to \
the equivalent Java language and typing constructs. \
 \
This package contains additional scripts."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "xmlbeans-scripts-2.6.0-13.1.noarch.rpm"
RPM_HASH = "e24c753e5259405cfc9ae4b3af3e58bd4222f4c55e9a1291b096e20680b0e3fad8a21a3688ba4a30e5a76e691de19670b78411e09167b58426aabb7d0ccdb297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlbeans-scripts"

RDEPENDS:${PN} += "/bin/sh \
xmlbeans"

inherit rpm
