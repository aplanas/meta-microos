SUMMARY = "Babel support for documents written in German"
DESCRIPTION = "This bundle is an extension to the babel package for \
multilingual typesetting. It provides all the necessary macros, \
definitions and settings to typeset German documents. The \
bundle includes support for the traditional and reformed German \
orthography as well as for the Austrian and Swiss varieties of \
German."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.13svn57978"

RPM_NAME = "texlive-babel-german-2023.209.2.13svn57978-54.1.noarch.rpm"
RPM_HASH = "f8cde6b9e3588542572b30662b56d84dadd6bfad73f85d15b84f3c02426f77e501c84697ffd10ecf949230de25856bec201f712f08328127013394653e4ea43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-austrian.ldf \
tex-german.ldf \
tex-germanb.ldf \
tex-naustrian.ldf \
tex-ngerman.ldf \
tex-ngermanb.ldf \
tex-nswissgerman.ldf \
tex-swissgerman.ldf \
texlive-babel-german"

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
