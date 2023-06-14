SUMMARY = "ANother Tool for Language Recognition (Manual)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the Java runtime for antlr"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-java-2.7.7-122.1.noarch.rpm"
RPM_HASH = "40194b03de4f676dde9a18e466e9c393c0507c2ccf325a3d15f2ed8ce47e69a31d5cbdffb65bb5891a2a5a8f46115479ec418db9ea1436a39e0c9707b946b400"
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
