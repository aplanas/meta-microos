SUMMARY = "C runtime for the ANTLR parsing library"
DESCRIPTION = "ANTLR, ANother Tool for Language Recognition, is a language tool that provides a \
framework for constructing recognizers, interpreters, compilers, and translators \
from grammatical descriptions containing actions in a variety of target \
languages. ANTLR provides excellent support for tree construction, tree walking, \
translation, error recovery, and error reporting."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "libantlr3c3-3.4-4.26.aarch64.rpm"
RPM_HASH = "d233ddfea1725c2309601f8f70f6fc731687f6c153402566f31b3503f107cc5105dc3211c888422671c83161f48366a4ea6a7ca1d3e58837cfe45ce451f577bf"

RPROVIDES:${PN} += "libantlr3c.so.3 \
libantlr3c3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
