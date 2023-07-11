SUMMARY = "Grammar Parser Library for Python"
DESCRIPTION = "The pyparsing module is an alternative approach to creating and executing \
simple grammars, vs. the traditional lex/yacc approach, or the use of regular \
expressions. The pyparsing module provides a library of classes that client \
code uses to construct the grammar directly in Python code."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "python311-pyparsing-3.0.9-4.3.noarch.rpm"
RPM_HASH = "b013907c4332a4de50061fa70f2cdd45acb738b590982afc1f6f49a67b8509cc6079bb794691251079ff1731b5980f0c40e8eb073da460675293f8de010f230f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparsing \
python3.11dist-pyparsing \
python311-pyparsing \
python3dist-pyparsing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
