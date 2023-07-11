SUMMARY = "DocBook to LaTeX Publishing - Documentation"
DESCRIPTION = "dblatex is a program that transforms your SGML/XMLDocBook documents to DVI, \
PostScript or PDF by translating them into pure LaTeX as a first process. \
MathML 2.0 markups are supported, too. It started as a clone of DB2LaTeX."
LICENSE = "GPL-2.0-only"

PV = "0.3.12"

RPM_NAME = "dblatex-doc-0.3.12-1.10.noarch.rpm"
RPM_HASH = "de0530e4a55421fba80fcdbd9cd73435a1ac4e0c25af70a2e6d1b8b2c1375499db9114969c6e71cf6934121a5bd27dabf84c4d4b41fefcd0aac8e77b1fd7759b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
