SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python311-gast-0.5.3-2.1.noarch.rpm"
RPM_HASH = "43d69259ad26469503220f06b0a40a39c7e2bbe6352ece570fea077f5ec8f2f90ce7425022234fa97c044c95e0d0b448357c09553b7c2815ebb113733a9a7d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gast \
python311-gast \
python3dist-gast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
