SUMMARY = "Extra PDF features for (Op)TeX"
DESCRIPTION = "This package provides extra PDF features for OpTeX (or in \
limited form for plain LuaTeX and LuaLaTeX). As a minimalistic \
format, OpTeX does not support 'advanced' features of the PDF \
file format in its base. This third party package aims to \
provide them. Summary of supported features: insertion of \
multimedia (audio, video, 3D), hyperlinks and other actions, \
triggering events, transitions, attachments."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn65184"

RPM_NAME = "texlive-pdfextra-2023.209.0.0.3svn65184-52.1.noarch.rpm"
RPM_HASH = "24e9c3583f0f6fdf8d6ccff6d0c8816a49982adca0a0f1ae4c916457af84f98b123721662e73b3d9e2424e15cc59dc57a7f8d87618961d373a2d6a60f7027542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfextra.sty \
tex-pdfextra.tex \
texlive-pdfextra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
