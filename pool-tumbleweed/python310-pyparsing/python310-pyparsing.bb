SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.1.0"

RPM_NAME = "python310-pyparsing-3.1.0-1.1.noarch.rpm"
RPM_HASH = "b92a8cdcd14615ba69711c1f84d46ba9890e84346ddc454e4283d3fad7cb9bdd99f7cb5ab9412adcd027a88e83a36a1cdc2d4a61d262e8ba3190e0b785a81aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyparsing \
python310-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
