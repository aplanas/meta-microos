SUMMARY = "Multi-format schema converter based on RELAX NG"
DESCRIPTION = "Trang converts between different schema languages for XML.  It supports the \
following languages: RELAX NG (both XML and compact syntax), XML 1.0 DTDs, W3C \
XML Schema.  A schema written in any of the supported schema languages can be \
converted into any of the other supported schema languages, except that W3C XML \
Schema is supported for output only, not for input."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "trang-20220510-4.1.noarch.rpm"
RPM_HASH = "e726d498b350b82d66999f6c52f4bd957ea164d61d7784bd8f04b397045f3b277623db4a19894682b0cb3e3364cbbd23a3978d44a7c80978a068b95082c8feb6"
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
