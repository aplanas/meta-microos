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

RPM_NAME = "antlr4-tool-4.13.0-1.2.noarch.rpm"
RPM_HASH = "3c12cf0b979424f8a570e3e52ce340980bff07ba4a68b5895d25ac79341962f877189756a4e1700463dc52f9336dc0fe1e98e991f396481e2d00290028b9dab5"
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
