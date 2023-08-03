SUMMARY = "Documentation for texlive-pmboxdraw"
DESCRIPTION = "This package includes the documentation for texlive-pmboxdraw"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn53046"

RPM_NAME = "texlive-pmboxdraw-doc-2023.209.1.4svn53046-53.1.noarch.rpm"
RPM_HASH = "69ec3d0b6c668bf3bcc111528d00fb583fd51fe6f20d4e8bb896a9ef80e2c1e8ea37a017e0fb94b898f92c17d563b9bcf5cb668b986c3120c8b5ea2bc9663885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmboxdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
