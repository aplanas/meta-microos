SUMMARY = "Produce lists of symbols as in nomenclature"
DESCRIPTION = "Produces lists of symbols using the capabilities of the \
MakeIndex program."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.6svn61029"

RPM_NAME = "texlive-nomencl-2023.209.5.6svn61029-55.1.noarch.rpm"
RPM_HASH = "573564cff19bc53e9a0ce04bda8d748175c62eb80b09e837ad828746ff51cd135e3cd6443682bd49c80f5cad8df76c04392301ad7f50d9a26e3b0bf740eab347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nomencl.sty \
texlive-nomencl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-tocbasic.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
