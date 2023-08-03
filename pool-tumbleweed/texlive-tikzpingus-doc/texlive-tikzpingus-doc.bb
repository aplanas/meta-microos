SUMMARY = "Documentation for texlive-tikzpingus"
DESCRIPTION = "This package includes the documentation for texlive-tikzpingus"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn64199"

RPM_NAME = "texlive-tikzpingus-doc-2023.209.1.0svn64199-53.1.noarch.rpm"
RPM_HASH = "6919aba5dad6ef7b317081cdcf67e5d887f2dc56f20f7064a8fb9317d8761443ce29487251608a4cabb5d1f5c82a60fd0f1c2882ad334bdb93c9ba89a39bdecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpingus-doc"

RDEPENDS:${PN} += ""

inherit rpm
