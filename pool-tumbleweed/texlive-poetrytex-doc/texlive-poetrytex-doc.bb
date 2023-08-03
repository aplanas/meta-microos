SUMMARY = "Documentation for texlive-poetrytex"
DESCRIPTION = "This package includes the documentation for texlive-poetrytex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn39921"

RPM_NAME = "texlive-poetrytex-doc-2023.209.3.0.1svn39921-53.1.noarch.rpm"
RPM_HASH = "a2900441cf9c350dd0717ad6ea51f0f6bacf779c63e16e0dc23faf2cf7b20f108b6e9b36023eed3770f4b139f5ddccc9f4ae778e94330ba1e493a0b05428cbea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poetrytex-doc"

RDEPENDS:${PN} += ""

inherit rpm
