SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python39-phply-1.2.6-1.2.noarch.rpm"
RPM_HASH = "d0fb31e4a5bf358c337be560a5de4ad3441f1947f0e3df1961fb89bf7fe628848a3eed00fc529339d88c972966866bb2ab8dc1052830aa11c00e3da9e3f2e749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-phply \
python39-phply \
python3dist-phply"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-ply \
update-alternatives"

inherit rpm
