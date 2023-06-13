SUMMARY = "Filecontents + macro + verbatim"
DESCRIPTION = "The package provides two environments called filecontentsdef \
and filecontentshere. They are derived from the LaTeX \
filecontents environment as provided by Scott Pakin's \
filecontents package. In addition to the file creation they \
either store the (verbatim) contents in a macro \
(filecontentsdef) or typeset them (verbatim) on the spot \
(filecontentshere). The author developed the package to display \
TeX code verbatim in documentation and the same time produce \
the corresponding files during the LaTeX run in order to embed \
them in the PDF as file attachment annotations (by using Scott \
Pakin's package attachfile)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn52208"

RPM_NAME = "texlive-filecontentsdef-2023.201.1.5svn52208-52.1.noarch.rpm"
RPM_HASH = "a856f1f27583f50b097311224208d69204291e7d9cc1ec5c8b2aacded5a27147451352172157a6b31e4dd2be35bb9503902d6ddb3ad634ba741e2381b60351d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(filecontentsdef.sty) \
texlive-filecontentsdef"

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
