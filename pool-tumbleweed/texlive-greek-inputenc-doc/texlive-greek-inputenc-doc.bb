SUMMARY = "Documentation for texlive-greek-inputenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-inputenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-doc-2023.209.1.8.2svn66296-54.2.noarch.rpm"
RPM_HASH = "c6dca715638b5a3f445e3805d5a3f956b8c354f20fd8cad43994b00c3d7492ce8f1e7308b1cc9d4d53cf92cc0afa9732264b0ade28f5fc3699805d054202e531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-inputenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
