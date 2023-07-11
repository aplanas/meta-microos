SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python311-phply-1.2.6-1.4.noarch.rpm"
RPM_HASH = "55de2dcda6178ea02a0ce24a333bd5e87093d31d92b904fc7abe8b2e3c564073f9c21ae269de779686a504b7a4c6d184c4a03b3de8d5d3be38845bdf26693560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phply \
python3.11dist-phply \
python311-phply \
python3dist-phply"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ply \
update-alternatives"

inherit rpm
