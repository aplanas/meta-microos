SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.1.0"

RPM_NAME = "python39-pyparsing-3.1.0-1.1.noarch.rpm"
RPM_HASH = "48e401d21f6d0d972f169010024ac018adf36a0dae9f3d751fed8b801dbff0d580f9d1e292bd090399fbd647c66c96746d1c03d3c6781e0b9e83436b0bfe0993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyparsing \
python39-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
