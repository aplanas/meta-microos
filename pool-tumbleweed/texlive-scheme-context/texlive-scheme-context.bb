SUMMARY = "ConTeXt scheme"
DESCRIPTION = "This is the TeX Live scheme for installing ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59636"

RPM_NAME = "texlive-scheme-context-2023.208.svn59636-60.1.noarch.rpm"
RPM_HASH = "c1178a9f9b97bf8342603d5ce86607838687090e8dad40475d84b1881477c6e28d0155c5b11ceb9cd0470a038482cb97789daa9518010fa6db48ddf9dddf2e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-context \
texlive-scheme-context"

RDEPENDS:${PN} += "texlive-antt \
texlive-asana-math \
texlive-ccicons \
texlive-collection-context \
texlive-collection-metapost \
texlive-dejavu \
texlive-eulervm \
texlive-gentium-tug \
texlive-iwona \
texlive-kurier \
texlive-ly1 \
texlive-manfnt-font \
texlive-marvosym \
texlive-mflogo-font \
texlive-poltawski \
texlive-pxfonts \
texlive-tex-gyre \
texlive-tex-gyre-math \
texlive-txfonts \
texlive-wasy \
texlive-xits"

inherit rpm
