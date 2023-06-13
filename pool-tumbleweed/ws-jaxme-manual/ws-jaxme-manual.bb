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

RPM_NAME = "ws-jaxme-manual-0.5.2-11.1.noarch.rpm"
RPM_HASH = "04f7b1b595b9f2c3680cee9dffef47e4296cf871db3bcd3db66b0c62688535db81d17b614a0f0d4854a17f1aa3bbeacc4fef22cacecee1d66b7d7df46f754d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ws-jaxme-manual"

RDEPENDS:${PN} += ""

inherit rpm
