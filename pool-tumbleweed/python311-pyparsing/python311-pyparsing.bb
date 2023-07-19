SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.1.0"

RPM_NAME = "python311-pyparsing-3.1.0-1.1.noarch.rpm"
RPM_HASH = "3438fb350c3ad67ce54cc73f89b2fa3df026262994d03119f77e6d37f0e86700f2bc206cf0e016757d5c14a48667aa190b8b0379f7951f196da1ddcb8f249266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparsing \
python3.11dist-pyparsing \
python311-pyparsing \
python3dist-pyparsing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
