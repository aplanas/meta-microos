SUMMARY = "Documentation for texlive-pst-vectorian"
DESCRIPTION = "This package includes the documentation for texlive-pst-vectorian"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-doc-2023.201.0.0.41svn60488-53.1.noarch.rpm"
RPM_HASH = "74881bd5b4dc862f0ed451fd30341ed1c3349e9f4a54ba8343b9a08c60aae69ee7147fc91c8738ee0fc2c4d928839f036b5df3a5b496b16efc47140cb95f963b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-vectorian-doc:fr) \
texlive-pst-vectorian-doc"
RDEPENDS:${PN} += ""

inherit rpm
