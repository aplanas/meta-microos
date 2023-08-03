SUMMARY = "Documentation for texlive-handoutwithnotes"
DESCRIPTION = "This package includes the documentation for texlive-handoutwithnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-doc-2023.209.1.3svn62140-54.1.noarch.rpm"
RPM_HASH = "1999ec7e135638cb0b640694f356b8c04f4f6e71ca6dae61c82728046a3af46ede6002e98449be53cd5a2bcf7c9da8a8e9cbc50b487710c5b1a9614c9dd70bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handoutwithnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
