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

RPM_NAME = "python311-ply-3.11-5.2.noarch.rpm"
RPM_HASH = "1d8bf1b54f9bcd6d532b804900993df09f4214b7dc04d3d4cae62b7d6d1f541c07d4d7c27b848d5d5bc1d98fc9ae54097007460cd609e2139e7376e7679b05ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ply \
python3.11dist-ply \
python311-ply \
python3dist-ply"

RDEPENDS:${PN} += "python-abi"

inherit rpm
