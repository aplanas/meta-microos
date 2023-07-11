SUMMARY = "Documentation for texlive-luabidi"
DESCRIPTION = "This package includes the documentation for texlive-luabidi"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn54512"

RPM_NAME = "texlive-luabidi-doc-2023.208.0.0.5svn54512-53.1.noarch.rpm"
RPM_HASH = "4485c068b6ab7fe5d47bd5c174c9be0b5279e48a213368e686684c8a6f2b30e7344da7f7b46a630d923a38f46c48bc6de31238c5edb0e87df02725ffe56cd2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luabidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
