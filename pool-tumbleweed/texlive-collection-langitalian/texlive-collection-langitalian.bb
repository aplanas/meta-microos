SUMMARY = "Italian"
DESCRIPTION = "Support for Italian."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn55129"

RPM_NAME = "texlive-collection-langitalian-2023.208.svn55129-60.1.noarch.rpm"
RPM_HASH = "27c87cbfc8b328ec856638c226ce216c41745dabe46df6ef1d3e7bb8b2341a2fde11b2378157e0185eea779852e81008dc077862960f4e1ddf0144ee48ccbb03"
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
