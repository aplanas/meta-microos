SUMMARY = "Open source implementation of JAXB"
DESCRIPTION = "A Java/XML binding compiler takes as input a schema description (in \
   most cases an XML schema, but it may be a DTD, a RelaxNG schema, \
   a Java class inspected via reflection, or a database schema). The \
   output is a set of Java classes: * A Java bean class matching the \
   schema description. (If the schema was obtained via Java \
   reflection, the original Java bean class.) \
 \
* Read a conforming XML document and convert it into the equivalent \
   Java bean. \
 \
* Vice versa, marshal the Java bean back into the original XML \
document."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "ws-jaxme-0.5.2-11.1.noarch.rpm"
RPM_HASH = "de6be022a030e8e65323a77ae95d7cee0a565452c6d4c245aa40883b0c860907e16b05b999a16f66505b82c32b5ae650973327aa61b81b4f76d3f8bd381e1e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ws-jaxme"
RDEPENDS:${PN} += ""

inherit rpm
