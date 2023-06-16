SUMMARY = "Associate counters, making them step when a master steps"
DESCRIPTION = "The package provides the means of declaring a set of counters \
to be stepped, each time some 'master' counter is stepped."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn38497"

RPM_NAME = "texlive-assoccnt-2023.201.0.0.8svn38497-53.1.noarch.rpm"
RPM_HASH = "a625d73938b9ab1874eb67a5b6c5e18a0b552f5ad713607b443dab266f46862dc0cbac7f45c996c6672269957c21276d008fc2f991e272a60b0783706427c230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assoccnt.sty \
texlive-assoccnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
