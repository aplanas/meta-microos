SUMMARY = "Lexer and parser for PHP source implemented using PLY"
DESCRIPTION = "phply is a parser for the PHP programming language written using PLY, a Lex/YACC-style parser generator toolkit for Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "python39-phply-1.2.6-1.4.noarch.rpm"
RPM_HASH = "669c076c7470935347a7b050574475e6551815a00f4a9e909a496a729339028902480714522c924fa3a019926b9bfe558637984080fe451f06f33b0cd79285b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-phply \
python39-phply \
python3dist-phply"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ply \
update-alternatives"

inherit rpm
