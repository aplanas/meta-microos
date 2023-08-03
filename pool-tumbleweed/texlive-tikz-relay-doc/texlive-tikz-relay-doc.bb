SUMMARY = "Documentation for texlive-tikz-relay"
DESCRIPTION = "This package includes the documentation for texlive-tikz-relay"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn64072"

RPM_NAME = "texlive-tikz-relay-doc-2023.209.1.3svn64072-53.1.noarch.rpm"
RPM_HASH = "711ce7600ddb84f8cebc341660c9dac249e39901c37800671a999e030a65ad56e816adabab3c7ed1a622ffaca0792f725e61e65a7523297b9e42c5a96749279b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-relay-doc"

RDEPENDS:${PN} += ""

inherit rpm
