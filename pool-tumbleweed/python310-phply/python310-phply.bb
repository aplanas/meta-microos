SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python310-phply-1.2.6-1.4.noarch.rpm"
RPM_HASH = "84d220af08a1687f5f5899bd34387946c64e6a5c90ddc52681522aab75e986569ad1151a45c8167c6c6929b628a6ec1d37f5afa88b02294e0e82c989f59f38d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-phply \
python310-phply \
python3dist-phply"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ply \
update-alternatives"

inherit rpm
