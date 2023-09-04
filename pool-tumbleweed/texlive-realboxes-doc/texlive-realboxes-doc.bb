SUMMARY = "Documentation for texlive-realboxes"
DESCRIPTION = "This package includes the documentation for texlive-realboxes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-doc-2023.209.0.0.2svn64967-54.2.noarch.rpm"
RPM_HASH = "094c7a5b69ca5f3a96181f06db23d19eac45fe0cdb3359bc1a0b63b799751057186015a5d5019b2904c7bb3db9f06f1f569bff70d7d7c91c56d30e47676e9411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realboxes-doc"

RDEPENDS:${PN} += ""

inherit rpm
