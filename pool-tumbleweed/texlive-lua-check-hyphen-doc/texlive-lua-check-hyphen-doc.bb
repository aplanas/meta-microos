SUMMARY = "Documentation for texlive-lua-check-hyphen"
DESCRIPTION = "This package includes the documentation for texlive-lua-check-hyphen"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.7asvn47527"

RPM_NAME = "texlive-lua-check-hyphen-doc-2023.208.0.0.7asvn47527-53.1.noarch.rpm"
RPM_HASH = "6cbacbda9d5e49f6c35937406469f706e2deaee5eb1272a2ba702f4bbf592a6fcdf93f27aab92741fb42de93a0b167251c7c086c6f8ef5efc043d7255aae992e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-check-hyphen-doc"

RDEPENDS:${PN} += ""

inherit rpm
