SUMMARY = "Input files ignoring LaTeX preamble, etcetera"
DESCRIPTION = "Input or include stand-alone LaTeX documents, ignoring \
everything but the material between \\begin{document} and \
\\end{document}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn25741"

RPM_NAME = "texlive-docmute-2023.201.1.4svn25741-52.1.noarch.rpm"
RPM_HASH = "8b389872c1dbc7f4a9b569f1343c6b532d4c4cdd305bec5c05fb889900547fae3c4ff12c9bab00f05297a1112623e237d45e4db0db53d070d97bef82908900ca"
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
