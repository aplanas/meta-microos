SUMMARY = "Multi-format schema converter based on RELAX NG"
DESCRIPTION = "Trang converts between different schema languages for XML.  It supports the \
following languages: RELAX NG (both XML and compact syntax), XML 1.0 DTDs, W3C \
XML Schema.  A schema written in any of the supported schema languages can be \
converted into any of the other supported schema languages, except that W3C XML \
Schema is supported for output only, not for input."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "trang-20220510-3.2.noarch.rpm"
RPM_HASH = "bb194b625e5ef409e684e3de3233048483f48b470310f5a46968946e27a9a4a271d881568acb84c7899ec12fe8d6823cddddf0d48d167f072c37e429261d6776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thaiopensource-trang \
mvn-org.relaxng-trang \
mvn-org.relaxng-trang-pom- \
trang"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils \
mvn-com.github.relaxng-relaxngDatatype \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
