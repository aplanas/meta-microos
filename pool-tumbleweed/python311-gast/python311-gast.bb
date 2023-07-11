SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python311-gast-0.5.3-2.3.noarch.rpm"
RPM_HASH = "6918e870c3773718e80e0319eeda61b8785615d67082e31b373ee9368edcd9518472bf11ccdfea8b7c8aef3b001ecd0abd78950022d8fb8d4d94b01e1d43e3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gast \
python3.11dist-gast \
python311-gast \
python3dist-gast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
