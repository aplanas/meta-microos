SUMMARY = "New implementation of picture commands"
DESCRIPTION = "This package was described in the 2nd edition of 'LaTeX: A \
Document Preparation System', but the LaTeX project team \
declined to produce the package. For a long time, LaTeX \
included a 'pict2e package' that merely produced an apologetic \
error message. The new package extends the existing LaTeX \
picture environment, using the familiar technique (cf. the \
graphics and color packages) of driver files (at present, \
drivers for dvips, pdfTeX, LuaTeX, XeTeX, VTeX, dvipdfm, and \
dvipdfmx are available). The package documentation has a fair \
number of examples of use, showing where things are improved by \
comparison with the LaTeX picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4bsvn56504"

RPM_NAME = "texlive-pict2e-2023.209.0.0.4bsvn56504-52.1.noarch.rpm"
RPM_HASH = "e738bd53709b3c0d8c7fd69ba8cfcdbf81ab8f4a8efc58bd565e3d4901586ffe387dd19c200a9903b7f8cc3f413a2159f8fd803860c7f1c5203381e1e135254c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-p2e-dvipdfm.def \
tex-p2e-dvipdfmx.def \
tex-p2e-dvips.def \
tex-p2e-luatex.def \
tex-p2e-pctex32.def \
tex-p2e-pctexps.def \
tex-p2e-pdftex.def \
tex-p2e-textures.def \
tex-p2e-vtex.def \
tex-p2e-xetex.def \
tex-pict2e.cfg \
tex-pict2e.sty \
texlive-pict2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
