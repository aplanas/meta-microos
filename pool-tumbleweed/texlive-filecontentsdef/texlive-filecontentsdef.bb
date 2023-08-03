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

PV = "2023.209.1.5svn52208"

RPM_NAME = "texlive-filecontentsdef-2023.209.1.5svn52208-53.1.noarch.rpm"
RPM_HASH = "677b5cb72ef1d97d4fb3445af439e975a91fd0770d5e2b22d1cf4405db9262375d45ed28f9d82e8b8051df12d6ad7069d5c7b1691bcc97c7192c95453aa0d95b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filecontentsdef.sty \
texlive-filecontentsdef"

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
