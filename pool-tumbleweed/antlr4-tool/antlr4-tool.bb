SUMMARY = "ANTLR 4 Tool"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a parser \
generator for reading, processing, executing, or translating \
structured text or binary files.  It can be used to build languages, \
tools, and frameworks. From a grammar, ANTLR generates a parser that \
can build and walk parse trees. \
 \
This package provides the ANTLR 4 grammar compiler."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "antlr4-tool-4.9.3-1.10.noarch.rpm"
RPM_HASH = "6c1b8b74230ba9cfec8c6a5eefcb8e99f4e76f54a9b34d68b4340f000f02d3dee3c5d33287595fdc77be9cc51cb968c67bcc5f033e7d3ead550a3f1098f99222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4 \
antlr4-tool \
mvn-org.antlr-antlr4 \
mvn-org.antlr-antlr4-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.ibm.icu-icu4j \
mvn-org.abego.treelayout-org.abego.treelayout.core \
mvn-org.antlr-ST4 \
mvn-org.antlr-antlr-runtime \
mvn-org.antlr-antlr4-runtime \
mvn-org.glassfish-javax.json"

inherit rpm
