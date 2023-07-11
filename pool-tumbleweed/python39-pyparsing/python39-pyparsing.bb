SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "python39-pyparsing-3.0.9-4.2.noarch.rpm"
RPM_HASH = "0fe27dd542fa34d11f657348c2496a7c24a90b161c7f0b665abf70e350b791cea6c631677246bccea0f4333813d09e9906b4ab3bf50d15e71daa3ead8c1ef637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyparsing \
python39-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
