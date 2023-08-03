SUMMARY = "Management of figures for large LaTeX documents"
DESCRIPTION = "Fig4LaTeX simplifies management of the figures in a large LaTeX \
document. Fig4LaTeX is appropriate for projects that include \
figures with graphics created by XFig -- in particular, \
graphics which use the combined PS/LaTeX (or PDF/LaTeX) export \
method. An example document (with its output) is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn26313"

RPM_NAME = "texlive-fig4latex-2023.209.0.0.2svn26313-53.1.noarch.rpm"
RPM_HASH = "b4760a07f51ae7e461b075ba8065e46301ec6a40b2221437cecf3750f1aed436ec88a784da278bb8b4deb76f385b005ac2ff9d74bb7eced205a41e44cfbe8f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fig4latex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-fig4latex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
