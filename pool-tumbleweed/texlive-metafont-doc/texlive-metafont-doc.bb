SUMMARY = "Documentation for texlive-metafont"
DESCRIPTION = "This package includes the documentation for texlive-metafont"
LICENSE = "SUSE-TeX"

PV = "2023.201.2.71828182svn66186"

RPM_NAME = "texlive-metafont-doc-2023.201.2.71828182svn66186-54.1.noarch.rpm"
RPM_HASH = "aa4ef02d5c7543bb17d056924d78fd5417f94df4a506781fe58c548d9a141b3437dfd797b0388d403deade6a2c916b9dcbdddc24bfd970245d48cd30e51ee193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(inimf.1) \
man(mf-nowin.1) \
man(mf.1) \
texlive-metafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
