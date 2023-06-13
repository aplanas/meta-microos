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

RPM_NAME = "python-ply-doc-3.11-5.1.noarch.rpm"
RPM_HASH = "11d5679e9cdc457d2673548116c913e394cdbdde0ead0dc13bbce4188062332a38f8d557dc183adb1cf9ddd3cc956fd92a10a82bfac06b0956f5d0457ff45d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ply-doc"

RDEPENDS:${PN} += ""

inherit rpm
