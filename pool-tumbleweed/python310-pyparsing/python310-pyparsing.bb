SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "python310-pyparsing-3.0.9-4.2.noarch.rpm"
RPM_HASH = "8311060ac05c27a64d0d37f06e518a5d132c9cad14d2805cf8859e27ffc5671ae7bb734e5c432f907daba2cc8e1cd1af2f5a3f09993074865c33e217a11470c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyparsing \
python310-pyparsing"

RDEPENDS:${PN} += ""

inherit rpm
