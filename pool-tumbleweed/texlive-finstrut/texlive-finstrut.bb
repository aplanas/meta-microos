SUMMARY = "Adjust behaviour of the ends of footnotes"
DESCRIPTION = "The LaTeX internal command \\@finalstrut is used automatically \
used at the end of footnote texts to insert a strut to avoid \
mis-spacing of multiple footnotes. Unfortunately the command \
can cause a blank line at the end of a footnote. The package \
provides a solution to this problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn21719"

RPM_NAME = "texlive-finstrut-2023.209.0.0.5svn21719-53.1.noarch.rpm"
RPM_HASH = "d04106575457035dc55b437572cf088b02b99afb1cc66ffac587232c3fadb8d99313f4ec06b807111b1e023a6a77e1ca299e5ee6d1ac722b878f4ba22a4f0352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-finstrut.sty \
texlive-finstrut"

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
