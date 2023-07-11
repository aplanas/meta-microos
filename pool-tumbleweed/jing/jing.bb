SUMMARY = "RELAX NG validator in Java"
DESCRIPTION = "jing is an XML validator implemented in Java. It validates against the \
RELAX NG schema language and implements the following specifications: \
 \
* RELAX NG 1.0 Specification \
* RELAX NG Compact Syntax \
* Parts of RELAX NG DTD Compatibility (checking of ID/IDREF/IDREFS) \
 \
It also comes with experimental support for schema languages other than \
RELAX NG: \
 \
* W3C XML Schema (based on Xerces-J) \
* Schematron 1.5 \
* Namespace Routing Language"
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-20220510-3.2.noarch.rpm"
RPM_HASH = "d43b5e03628b853be92a7d92d1a2ec30d2c3031bb32586883abbb93fd1c27295a17e62608cac9d02c818c2a7d2540344f991d0794ded7be757e973bc43ad4d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing \
mvn-com.thaiopensource-jing \
mvn-org.relaxng-jing \
mvn-org.relaxng-jing-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils \
mvn-com.github.relaxng-relaxngDatatype \
mvn-isorelax-isorelax \
mvn-net.sf.saxon-saxon \
mvn-xerces-xercesImpl \
mvn-xml-apis-xml-apis \
mvn-xml-resolver-xml-resolver"

inherit rpm
