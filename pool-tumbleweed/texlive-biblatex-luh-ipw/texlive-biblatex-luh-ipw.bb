SUMMARY = "BibLaTeX styles for social sciences"
DESCRIPTION = "The bundle is a small collection of styles for BibLaTeX. It was \
designed for citations in the Humanities, following the \
guidelines of style of the institutes for the social sciences \
of the Leibniz University Hannover/LUH (especially the \
Institute of Political Science). The bundle depends on BibLaTeX \
(version 1.1 at least) and cannot be used without it."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn32180"

RPM_NAME = "texlive-biblatex-luh-ipw-2023.201.0.0.3svn32180-53.1.noarch.rpm"
RPM_HASH = "9a389ab868467338a69b2a441c473f38cd6d01013936de1f014ac79872f6b83ed8efbfa9fe8efd62871d3bc0adb2af10ac382a350f48d065f308326f3a4a9e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(authoryear-luh-ipw.bbx) \
tex(authoryear-luh-ipw.cbx) \
tex(english-luh-ipw.lbx) \
tex(german-luh-ipw.lbx) \
tex(standard-luh-ipw.bbx) \
tex(standard-luh-ipw.cbx) \
tex(verbose-inote-luh-ipw.bbx) \
tex(verbose-inote-luh-ipw.cbx) \
texlive-biblatex-luh-ipw"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authoryear-icomp.bbx) \
tex(authoryear-icomp.cbx) \
tex(verbose-inote.bbx) \
tex(verbose-inote.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
