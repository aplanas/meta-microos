SUMMARY = "Hyphenation for letterspacing, underlining, and more"
DESCRIPTION = "The package provides hyphenable spacing out (letterspacing), \
underlining, striking out, etc., using the TeX hyphenation \
algorithm to find the proper hyphens automatically. It also \
provides a mechanism that can be used to implement similar \
tasks, that have to treat text syllable by syllable. This is \
shown in two examples. This version is a merge of the original \
soul package from Melchior Franz and the soulutf8 package from \
Heiko Oberdiek and supports also UTF8."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn65908"

RPM_NAME = "texlive-soul-2023.209.3.0svn65908-58.1.noarch.rpm"
RPM_HASH = "2ee5c2a87e2a5a72fee26c17c4b87236a9102649aa3da1bbb7287dccdcce9573119d75cc9e0622252aa6ae0538939bea9d61e7fef6cbfb50e434bd8bd5acc385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soul-ori.sty \
tex-soul.sty \
tex-soulutf8.sty \
texlive-soul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etexcmds.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
