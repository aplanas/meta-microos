SUMMARY = "A fancy means of underlining"
DESCRIPTION = "The package combines the use of soul with the savepos mechanism \
of current pdfTeX so that the user can create (almost) \
arbitrary underlining and similar 'decorations', including \
rules, leaders and even pictures (pgf, pstricks, etc.). Unlike \
soul underlines, which are built by repeating small elements, \
here each chunk of text to be underlined is a single element."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn60772"

RPM_NAME = "texlive-soulpos-2023.209.1.2svn60772-58.1.noarch.rpm"
RPM_HASH = "b360b77fcd17a532d4b1a6e94b5c2fdd8b94620109cf405b98ae8d136ab083a504ef622b222ff4ba51d7c02eb5d956127f7c9872af3d15e5e709592ae1552085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soulpos.sty \
texlive-soulpos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-soulutf8.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-soul"

inherit rpm
