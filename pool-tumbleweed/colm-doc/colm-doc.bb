SUMMARY = "Documentation for the Colm programming language"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages. \
 \
This subpackage contains the documentation in HTML format."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "colm-doc-0.14.7-2.4.noarch.rpm"
RPM_HASH = "daa3f2a857b1d4b1ce341fae1fef2cca98828a80598bc31a070454c660059a55d27f30780d205abd7188c8e8347b5b346c5f0cea1990dfd3ab5f53ffa888f3bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colm-doc"

RDEPENDS:${PN} += ""

inherit rpm
