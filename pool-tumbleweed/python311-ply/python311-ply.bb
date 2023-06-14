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

RPM_NAME = "python311-ply-3.11-5.1.noarch.rpm"
RPM_HASH = "00d0a82c2afe61281be71efe34fd4262f0ef96561d71676957e017b2d087d21d63c68f789c73cb89ea0ab809a3a5e198f5d1fcf8fec535fb47347400519c1149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ply \
python311-ply \
python3dist-ply"

RDEPENDS:${PN} += "python-abi"

inherit rpm
