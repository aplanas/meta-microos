SUMMARY = "Documentation for texlive-physconst"
DESCRIPTION = "This package includes the documentation for texlive-physconst"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn58727"

RPM_NAME = "texlive-physconst-doc-2023.209.1.1.2svn58727-52.1.noarch.rpm"
RPM_HASH = "993f1707b55abc6e5a797f2ae8350af44d9867a0179c9439030d3e467de047838ca0bb5f0dea99160724f4d7af72606c97602545d7b2a506954a0831a06699ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physconst-doc"

RDEPENDS:${PN} += ""

inherit rpm
