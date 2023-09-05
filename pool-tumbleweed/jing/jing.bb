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

RPM_NAME = "jing-20220510-4.1.noarch.rpm"
RPM_HASH = "b700d240a3eb3d5a1094a6132bbce89480cffc38b10f91719b295e5a71ddfef0e5c7e509317f7f1c82c39d037ee6d418dc14a5a7625399f9c079ec51ae57ca3a"
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
mvn-net.sf.saxon-Saxon-HE \
mvn-xerces-xercesImpl \
mvn-xml-apis-xml-apis \
mvn-xml-resolver-xml-resolver"

inherit rpm
