SUMMARY = "Victor Eijkhout's packages"
DESCRIPTION = "Three unrelated packages: DB_process, to parse and process \
database output; CD_labeler, to typeset user text to fit on a \
CD label; and repeat, a nestable, generic loop macro."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eijkhout-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "31df6518861840869582943c89facc8e7adc363c8200524ade03231cd7850d9ed8b953b3f4790ece15d3c737510260c1b93d9f65cba28e2043639e08aee145aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CD-labeler-test.tex \
tex-CD-labeler.tex \
tex-DB-process.tex \
tex-repeat.tex \
texlive-eijkhout"

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
