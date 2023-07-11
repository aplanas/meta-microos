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

RPM_NAME = "antlr3c-devel-3.4-4.26.aarch64.rpm"
RPM_HASH = "953d0dfe3642011b551dca97c61d58bd3983f748cb7d7c01fbe446dc2d7e5884fe6e5ab86be507695dee36d69c32f606230857f0abe6143c222f093d7a032f76"

RPROVIDES:${PN} += "antlr3c-devel"

RDEPENDS:${PN} += "libantlr3c3"

inherit rpm
