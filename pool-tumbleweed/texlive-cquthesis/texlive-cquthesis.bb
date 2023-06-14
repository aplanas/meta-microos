SUMMARY = "LaTeX Thesis Template for Chongqing University"
DESCRIPTION = "CQUThesis stands for Chongqing University Thesis Template for \
LaTeX, bearing the ability to support bachelor, master, doctor \
dissertations with grace and speed."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.50svn55643"

RPM_NAME = "texlive-cquthesis-2023.204.1.50svn55643-54.1.noarch.rpm"
RPM_HASH = "460268bf9859373e8f05c57e0b08c635344feefb505cdbd8eb358140341bad204c5f67648b6725aa1fb8fe4322b9a988765aae9fb8fa0db990044d24b6288763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cquthesis.cfg \
tex-cquthesis.cls \
tex-cquthesis.sty \
texlive-cquthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-bicaption.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-changepage.sty \
tex-courier.sty \
tex-ctexbook.cls \
tex-diagbox.sty \
tex-dirtree.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-metalogo.sty \
tex-mhchem.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-newfloat.sty \
tex-newtxtext.sty \
tex-ntheorem.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tabu.sty \
tex-tabularx.sty \
tex-tocloft.sty \
tex-totcount.sty \
tex-upgreek.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
