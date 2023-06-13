SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "python311-pyparsing-3.0.9-4.1.noarch.rpm"
RPM_HASH = "5c6b1c5b51601789f2b9ac6d42824252eb1144f0c95246688a294ba1e90d97eb46d1754d081600c70eec7d3ca2dfdd8ce5d45455ee73c392c392cbc7cb08ec86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyparsing) \
python311-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
