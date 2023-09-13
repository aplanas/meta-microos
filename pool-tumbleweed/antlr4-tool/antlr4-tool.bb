SUMMARY = "ANTLR 4 Tool"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a parser \
generator for reading, processing, executing, or translating \
structured text or binary files.  It can be used to build languages, \
tools, and frameworks. From a grammar, ANTLR generates a parser that \
can build and walk parse trees. \
 \
This package provides the ANTLR 4 grammar compiler."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-tool-4.13.0-2.1.noarch.rpm"
RPM_HASH = "7eb988e0f0e16b6c9685bf6f628c0df20c42e4fccca5c65e8252fd1bcfb7ea440f91f237105af01ec809c8385da6b922c41607f7ab4e8429816d114417f586db"
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
mvn-org.antlr-antlr4-runtime"

inherit rpm
