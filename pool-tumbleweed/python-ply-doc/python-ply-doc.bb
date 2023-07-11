SUMMARY = "Python Lex & Yacc"
DESCRIPTION = "PLY is yet another implementation of lex and yacc for Python. Some notable \
features include the fact that its implemented entirely in Python and it \
uses LALR(1) parsing which is efficient and well suited for larger grammars. \
 \
PLY provides most of the standard lex/yacc features including support for empty \
productions, precedence rules, error recovery, and support for ambiguous grammars. \
 \
PLY provides extensive error checking. \
It is compatible with both Python 2 and Python 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "python-ply-doc-3.11-5.2.noarch.rpm"
RPM_HASH = "a047ae74ca2b09d121ba269532df2881217e773c64e75251a6459386f72226122ceb6d1a3b9c7091e830fe15b7a4b87a7f893346ca82dcf057254c2a43450a58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ply-doc"

RDEPENDS:${PN} += ""

inherit rpm
