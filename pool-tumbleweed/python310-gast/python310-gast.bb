SUMMARY = "Python AST that abstracts the underlying Python version"
DESCRIPTION = " \
A generic AST to represent Python2 and Python3's Abstract Syntax Tree(AST). \
 \
GAST provides a compatibility layer between the AST of various Python versions, \
as produced by ``ast.parse`` from the standard ``ast`` module."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python310-gast-0.5.3-2.1.noarch.rpm"
RPM_HASH = "5b9037780cb4865f4fb3ab3b8deb06e909263f5c94a03c67f3f64a8cc64d9905843483956ddfebe92c6ab4b4b76bc0c42f0961bd22978b06bb8f7b07815377bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gast \
python3.10dist(gast) \
python310-gast \
python3dist(gast)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
