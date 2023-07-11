SUMMARY = "Java XSLT compiler"
DESCRIPTION = "The XSLT Compiler is a Java-based tool for compiling XSLT stylesheets \
into lightweight and portable Java byte codes called translets."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-xsltc-2.7.2-12.7.noarch.rpm"
RPM_HASH = "4ea03ed26cb178392991e41df3d83b5295e14fbfc21587b33309b8beeaa18a796ad1ff066ef6cdb703df017edbd9d1a699ff2d9a29e08b4725dde75bc67260fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xalan-xsltc \
mvn-xalan-xsltc-pom- \
xalan-j2-xsltc"

RDEPENDS:${PN} += "bcel \
java-cup \
java-headless \
javapackages-filesystem \
jaxp-parser-impl \
jlex \
mvn-xalan-xalan \
regexp"

inherit rpm
