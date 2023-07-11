SUMMARY = "Documentation for the Colm programming language"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages. \
 \
This subpackage contains the documentation in HTML format."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "colm-doc-0.14.7-2.5.noarch.rpm"
RPM_HASH = "497f4785ccc198a10abaf96df1f7279eba0da30bbacbc8585c866027f2e272e6961509bf5c573ac8ca4d62ac0e679bbde1c288218c08f1fbdaf9ea4912c8ecb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colm-doc"

RDEPENDS:${PN} += ""

inherit rpm
