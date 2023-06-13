SUMMARY = "DocBook to LaTeX Publishing - Documentation"
DESCRIPTION = "dblatex is a program that transforms your SGML/XMLDocBook documents to DVI, \
PostScript or PDF by translating them into pure LaTeX as a first process. \
MathML 2.0 markups are supported, too. It started as a clone of DB2LaTeX."
LICENSE = "GPL-2.0-only"

PV = "0.3.12"

RPM_NAME = "dblatex-doc-0.3.12-1.9.noarch.rpm"
RPM_HASH = "bed3cab9459454b600664aa523ef57339e702eaf75f6b969f0239e8c11ef5f90e961176bf64ee2f477372837cc6210b2ef6d2b4e66d2d48fb8b8b546b749597f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
