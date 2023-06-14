SUMMARY = "Documentation for texlive-unizgklasa"
DESCRIPTION = "This package includes the documentation for texlive-unizgklasa"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51647"

RPM_NAME = "texlive-unizgklasa-doc-2023.201.1.0svn51647-53.1.noarch.rpm"
RPM_HASH = "04801049d7870f29e471c9082280b2772978e627540384810df554ff203c1f8696bb9f30d1eeafb2d3b4e6ea026f36f94e08f5a39400a58e59392cf8e67bfd77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-unizgklasa-doc-hr \
texlive-unizgklasa-doc"

RDEPENDS:${PN} += ""

inherit rpm
