SUMMARY = "Citations in footnotes"
DESCRIPTION = "A BibTeX style and a LaTeX package that allow for a full \
bibliography at the end of the document as well as citation \
details in footnotes. The footnote details include 'op. cit.' \
and 'ibid.' contractions."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22018"

RPM_NAME = "texlive-inlinebib-2023.201.svn22018-52.1.noarch.rpm"
RPM_HASH = "420983b5b4f38f82f4c62feaf9c73930496281bb31b5c827b2d64407b395e48dcd5a05bc50c5d0b91eb64e46d558bf70f00c02c607b8947630f3b0d5af4030ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinebib.sty \
tex-pageranges.sty \
texlive-inlinebib"

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
