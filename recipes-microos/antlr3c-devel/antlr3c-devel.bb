SUMMARY = "C runtime for the ANTLR parsing library"
DESCRIPTION = "ANTLR, ANother Tool for Language Recognition, is a language tool that provides a \
framework for constructing recognizers, interpreters, compilers, and translators \
from grammatical descriptions containing actions in a variety of target \
languages. ANTLR provides excellent support for tree construction, tree walking, \
translation, error recovery, and error reporting. \
 \
This package contains header files and development libraries needed to \
develop programs using the antlr3c library."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "antlr3c-devel-3.4-4.25.aarch64.rpm"
RPM_HASH = "6da13bf8ae06db0e821a089f819bf4588a1636d9fa576e9e109d1b99fabb86a20f011903f2b9572a94883e73eb629d83a6d3ba285eacb03135aced9c9a3f37b1"

RPROVIDES:${PN} += "antlr3c-devel \
antlr3c-devel(aarch-64)"
RDEPENDS:${PN} += "libantlr3c3"

inherit rpm
