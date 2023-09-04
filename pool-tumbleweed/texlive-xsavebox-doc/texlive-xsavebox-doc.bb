SUMMARY = "Documentation for texlive-xsavebox"
DESCRIPTION = "This package includes the documentation for texlive-xsavebox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.18svn64049"

RPM_NAME = "texlive-xsavebox-doc-2023.209.0.0.18svn64049-53.2.noarch.rpm"
RPM_HASH = "3ecf6361bb5076deb92e2743d812ec1c9e5349a51a9b4cc10076dfa5a56a5b9f3747a57945d715186e3078e26c56f0c48e718e7d3ec81795d75a6abfe9ba7640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsavebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
