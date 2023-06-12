SUMMARY = "Extra PDF features for (Op)TeX"
DESCRIPTION = "This package provides extra PDF features for OpTeX (or in \
limited form for plain LuaTeX and LuaLaTeX). As a minimalistic \
format, OpTeX does not support 'advanced' features of the PDF \
file format in its base. This third party package aims to \
provide them. Summary of supported features: insertion of \
multimedia (audio, video, 3D), hyperlinks and other actions, \
triggering events, transitions, attachments."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn65184"

RPM_NAME = "texlive-pdfextra-2023.201.0.0.3svn65184-51.1.noarch.rpm"
RPM_HASH = "553073034501ab43c4e90eb4be4bb8ac7693920b9cc79d6f51c9a9a1865c8e6100b745068b29d2304d5b1455d9c62b69afa04718f2adf72338383c826d3e1a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfextra.sty) \
tex(pdfextra.tex) \
texlive-pdfextra"
RDEPENDS:${PN} += "/bin/sh \
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
