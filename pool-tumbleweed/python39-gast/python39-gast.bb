SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python39-gast-0.5.3-2.3.noarch.rpm"
RPM_HASH = "7be3194be24ffdde3eb8a441c7fafaf519816c130542c426a55ab7c6eb3615887d248c2b24f37bf9f75438331a689be061cafe28edfa6e58056b6050c990c132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gast \
python39-gast \
python3dist-gast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
