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

RPM_NAME = "nekohtml-1.9.22.noko2-1.4.noarch.rpm"
RPM_HASH = "6301a18655fb534753a542dbd73cdefe05c2034fef6b2ac6a4c1c44ab3289d6f1ed599287870e24c8f542a153ff7962c7127af379fec9299cc34cf84cb3e2979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(nekohtml:nekohtml) \
mvn(nekohtml:nekohtml:pom:) \
mvn(net.sourceforge.nekohtml:nekohtml) \
mvn(net.sourceforge.nekohtml:nekohtml-xni) \
mvn(net.sourceforge.nekohtml:nekohtml:pom:) \
nekohtml \
osgi(org.cyberneko.html)"

RDEPENDS:${PN} += "/bin/bash \
bcel \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn(xerces:xercesImpl) \
xerces-j2 \
xml-apis"

inherit rpm
