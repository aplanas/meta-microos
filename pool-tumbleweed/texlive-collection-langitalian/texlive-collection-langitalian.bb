SUMMARY = "Italian"
DESCRIPTION = "Support for Italian."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn55129"

RPM_NAME = "texlive-collection-langitalian-2023.208.svn55129-58.1.noarch.rpm"
RPM_HASH = "ee4e439e3ad37010a4b21de23d990074773ddc47ee3f63c4316c65acbc8bb86a0ba8d45d3468c0e6115f5368797a19fc5e5f056d9f102a1464c4ce237ae02039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langitalian"
RDEPENDS:${PN} += "texlive-amsldoc-it \
texlive-amsmath-it \
texlive-amsthdoc-it \
texlive-antanilipsum \
texlive-babel-italian \
texlive-codicefiscaleitaliano \
texlive-collection-basic \
texlive-fancyhdr-it \
texlive-fixltxhyph \
texlive-frontespizio \
texlive-hyphen-italian \
texlive-itnumpar \
texlive-l2tabu-italian \
texlive-latex4wp-it \
texlive-layaureo \
texlive-lshort-italian \
texlive-psfrag-italian \
texlive-texlive-it \
texlive-verifica"

inherit rpm
