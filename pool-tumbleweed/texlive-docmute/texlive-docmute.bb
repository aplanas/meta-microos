SUMMARY = "Input files ignoring LaTeX preamble, etcetera"
DESCRIPTION = "Input or include stand-alone LaTeX documents, ignoring \
everything but the material between \\begin{document} and \
\\end{document}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn25741"

RPM_NAME = "texlive-docmute-2023.209.1.4svn25741-53.1.noarch.rpm"
RPM_HASH = "bf7d597a7e74e2e4b844e3c856ae54412d3fbadcfc0979836573d5739928859e9bbfd362a29f4d96029270c91ede7bb6e9391cf62df42628762fc2395211f36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docmute.sty \
texlive-docmute"

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
