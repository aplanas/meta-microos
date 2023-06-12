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

PV = "2023.201.0.0.4bsvn56504"

RPM_NAME = "texlive-pict2e-2023.201.0.0.4bsvn56504-51.1.noarch.rpm"
RPM_HASH = "8925dd43af36c7660bd8306851518ab3c8ae929bdc9a22071a18e112fe381d991a91d8c9ebd70ade3680e7679969fecce6801a3f81802bc523ede46f18c3a5a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(p2e-dvipdfm.def) \
tex(p2e-dvipdfmx.def) \
tex(p2e-dvips.def) \
tex(p2e-luatex.def) \
tex(p2e-pctex32.def) \
tex(p2e-pctexps.def) \
tex(p2e-pdftex.def) \
tex(p2e-textures.def) \
tex(p2e-vtex.def) \
tex(p2e-xetex.def) \
tex(pict2e.cfg) \
tex(pict2e.sty) \
texlive-pict2e"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(trig.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
