SUMMARY = "HTML scanner and tag balancer"
DESCRIPTION = "NekoHTML is a simple HTML scanner and tag balancer that enables \
application programmers to parse HTML documents and access the \
information using standard XML interfaces. The parser can scan HTML \
files and 'fix up' many common mistakes that human (and computer) \
authors make in writing HTML documents.  NekoHTML adds missing parent \
elements; automatically closes elements with optional end tags; and \
can handle mismatched inline element tags. \
NekoHTML is written using the Xerces Native Interface (XNI) that is \
the foundation of the Xerces2 implementation. This enables you to use \
the NekoHTML parser with existing XNI tools without modification or \
rewriting code."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-1.9.22.noko2-1.5.noarch.rpm"
RPM_HASH = "50f43aa93b6335b409d24108db6796986376654a313450a74987d8fde61db258eb0f49b9647ff2851070fa146893e82e5b4caee16e709965ea12bbdd76e2dc97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-nekohtml-nekohtml \
mvn-nekohtml-nekohtml-pom- \
mvn-net.sourceforge.nekohtml-nekohtml \
mvn-net.sourceforge.nekohtml-nekohtml-pom- \
mvn-net.sourceforge.nekohtml-nekohtml-xni \
nekohtml \
osgi-org.cyberneko.html"

RDEPENDS:${PN} += "/usr/bin/bash \
bcel \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-xerces-xercesImpl \
xerces-j2 \
xml-apis"

inherit rpm
