SUMMARY = "Documentation for texlive-pdflscape"
DESCRIPTION = "This package includes the documentation for texlive-pdflscape"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn64851"

RPM_NAME = "texlive-pdflscape-doc-2023.209.0.0.13svn64851-52.1.noarch.rpm"
RPM_HASH = "211e56d0d8fd8b57c10a47bceb9086acbf43593b6145e7c96da76a2811379b4a22e04998924513a31268a6f0656b35bf0145db1eb78b2e7abeadb8a380b36e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflscape-doc"

RDEPENDS:${PN} += ""

inherit rpm
