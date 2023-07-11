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

RPM_NAME = "python39-ply-3.11-5.2.noarch.rpm"
RPM_HASH = "7cd86fe487be2742bc0a581d765ec90fea57fa99c15652caf3f1ae730bb0e0d7bd9bc92b93fa8036155f2a3071965f51b6bacfbc5ff22c5e85de9bc7f856f7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ply \
python39-ply \
python3dist-ply"

RDEPENDS:${PN} += "python-abi"

inherit rpm
