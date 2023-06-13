SUMMARY = "Typeset and index linguistic gloss abbreviations"
DESCRIPTION = "The package provides a set of macros for in-line linguistic \
examples (as opposed to interlinear glossing, set apart from \
the main text). It prevents hyphenated examples from breaking \
across lines and consistently formats phonemic examples, \
orthographic examples, and more."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30788"

RPM_NAME = "texlive-textglos-2023.201.1.0svn30788-54.1.noarch.rpm"
RPM_HASH = "fdfb859e2f724fb2e51d2709833079576823ceb6764d22cc8dbd882828d0783512564a2f57c099828d99b8d2436e33520ec2651e19205bac22c161cbee9f8edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(textglos.sty) \
texlive-textglos"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
