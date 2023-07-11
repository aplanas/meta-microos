SUMMARY = "ANother Tool for Language Recognition (Manual)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the Java runtime for antlr"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-java-2.7.7-122.2.noarch.rpm"
RPM_HASH = "ba1dd77814ccf4d465dd6b4d53bab5b55f3998feb15a179500bb68a0bdabcf189f9229bf569f678917efb8b5fc40960e2a7d685e6264c9350f84f7bbfe6cc52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-java \
mvn-antlr-antlr \
mvn-antlr-antlr-pom- \
mvn-antlr-antlrall \
mvn-antlr-antlrall-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
