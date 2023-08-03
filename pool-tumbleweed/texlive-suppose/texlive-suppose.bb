SUMMARY = "Abbreviate the word 'Suppose'"
DESCRIPTION = "This package provides commands for abbreviating the word \
'Suppose' in six fonts and with other variations. The author \
recommends only using these commands when the immediately \
succeeding strings are mathematical in nature. He does not \
recommend using them in formal work. The package requires \
amsmath, amsfonts, and graphicx."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn59281"

RPM_NAME = "texlive-suppose-2023.209.1.2.2svn59281-58.1.noarch.rpm"
RPM_HASH = "47a1be1ed7aa0e5d8db138baa4991d5468dc5c0fcc72c953eca3b3e1b96c1a8ec0b714f10497830da7463f978b652cf782811431d9ed50b79f1ee396025a3909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suppose.sty \
texlive-suppose"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-euscript.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
