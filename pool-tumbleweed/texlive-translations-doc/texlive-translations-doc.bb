SUMMARY = "Documentation for texlive-translations"
DESCRIPTION = "This package includes the documentation for texlive-translations"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn61896"

RPM_NAME = "texlive-translations-doc-2023.209.1.12svn61896-53.1.noarch.rpm"
RPM_HASH = "4a4251c5084ce5564544c03e399f6e430c2a60178ff6439c511e0d1bd2819e58a399d8af3d5d8326e1ef9a1f3322017d9919e8fd73eaff22bc2c128d357cff6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-translations-doc-en \
texlive-translations-doc"

RDEPENDS:${PN} += ""

inherit rpm
