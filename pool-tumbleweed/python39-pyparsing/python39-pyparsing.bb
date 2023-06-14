SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "python39-pyparsing-3.0.9-4.1.noarch.rpm"
RPM_HASH = "c66a701c4c80ec39ae05d0a6a2f34025d455e6bbec08c2251123a3c9f0b555596d5f45e3d158994518a3bce9db06546fbe4a4e895db27ca5f4008d2cf4177de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyparsing \
python39-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
