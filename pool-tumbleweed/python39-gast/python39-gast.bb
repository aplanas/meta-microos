SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python39-gast-0.5.3-2.1.noarch.rpm"
RPM_HASH = "59f4af76cc5a2033f5dccbbcdb1ec92a80a09f8c106a46f18ff09d5d1008d0030e103842c3df17a5ce86b918a59dc14e3c667c4b8a82ebbb01933ceb1b98dd0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gast) \
python39-gast \
python3dist(gast)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
