SUMMARY = "Multi-format schema converter based on RELAX NG"
DESCRIPTION = "Trang converts between different schema languages for XML.  It supports the \
following languages: RELAX NG (both XML and compact syntax), XML 1.0 DTDs, W3C \
XML Schema.  A schema written in any of the supported schema languages can be \
converted into any of the other supported schema languages, except that W3C XML \
Schema is supported for output only, not for input."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "trang-20220510-3.1.noarch.rpm"
RPM_HASH = "a56a8b8c47661614fb7b9bf2ea5b9d62db5ee606c09efba9710d7979c69a9a36aeb96d9aea6fcdd4b989e4c1e1f4ecf5fdaa64f356a9a72e84b86e8024ee4348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thaiopensource-trang \
mvn-org.relaxng-trang \
mvn-org.relaxng-trang-pom- \
trang"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils \
mvn-com.github.relaxng-relaxngDatatype \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
