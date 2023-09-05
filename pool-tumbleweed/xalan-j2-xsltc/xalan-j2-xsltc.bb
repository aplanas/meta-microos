SUMMARY = "Java XSLT compiler"
DESCRIPTION = "The XSLT Compiler is a Java-based tool for compiling XSLT stylesheets \
into lightweight and portable Java byte codes called translets."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-xsltc-2.7.3-1.1.noarch.rpm"
RPM_HASH = "3d3111a1304dba27de914a3e5c79fd023e1caa213c1a88774cd45b4c24537c85e5124e2e92af968257d3a07c63b38b21cbba656a2e5a347721e5c69bec2182fa"
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
