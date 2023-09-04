SUMMARY = "Documentation for texlive-zwgetfdate"
DESCRIPTION = "This package includes the documentation for texlive-zwgetfdate"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-zwgetfdate-doc-2023.209.svn15878-53.2.noarch.rpm"
RPM_HASH = "5bf93591458f13ae2c0a352fce8c7504eef33654fb0e9d6a2a2afbf6c610717ec3b68f189a86e1846ab10fc89f4fed09c4ad2615c7a183d326f3b1ce358073c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwgetfdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
