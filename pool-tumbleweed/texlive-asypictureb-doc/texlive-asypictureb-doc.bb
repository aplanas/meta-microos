SUMMARY = "Documentation for texlive-asypictureb"
DESCRIPTION = "This package includes the documentation for texlive-asypictureb"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn33490"

RPM_NAME = "texlive-asypictureb-doc-2023.201.0.0.3svn33490-53.1.noarch.rpm"
RPM_HASH = "1b207f5bf418e4d75eb414d423154f686aae492459bb2d5cd6dbae795f8b732d9a5b4a46fa3aed1b8717a523fdae20d51ba9bf21fd73f26c4c15f1dbb049563e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asypictureb-doc"

RDEPENDS:${PN} += ""

inherit rpm
