SUMMARY = "Documentation for texlive-abspos"
DESCRIPTION = "This package includes the documentation for texlive-abspos"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn64465"

RPM_NAME = "texlive-abspos-doc-2023.201.0.0.1svn64465-54.1.noarch.rpm"
RPM_HASH = "deb9c9c056656b532f9493db2e45ace68711130fa61ea0b478e2bd351d0177cb2f8a489e43ed348056f16495f7bb191d5acc1668721eb4a53021ce2cc031957b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abspos-doc"

RDEPENDS:${PN} += ""

inherit rpm
