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
LICENSE = "BSD-3-Clause"

PV = "3.11"

RPM_NAME = "python310-ply-3.11-5.2.noarch.rpm"
RPM_HASH = "76cecaf2a31ebc2ef5462a1c1486001ff34c896b757b551de46a02bdd112e378a6ba00f888d5d4c245ad582c8214b943cf6edb959e816da81030d95bfa8481ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ply \
python310-ply \
python3dist-ply"

RDEPENDS:${PN} += "python-abi"

inherit rpm
