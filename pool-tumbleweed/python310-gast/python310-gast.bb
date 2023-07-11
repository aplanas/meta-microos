SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python310-gast-0.5.3-2.3.noarch.rpm"
RPM_HASH = "128518efbd323eee57c0dd23c4bb9fea0e005371c534921b952ef8e6adabc71732a27005142ac7599b650127c71fc21ed426464d1224f75deb3363b23789a9b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gast \
python310-gast \
python3dist-gast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
