SUMMARY = "Checksum based rerun checks on auxiliary files"
DESCRIPTION = "The package provides additional rerun warnings if some \
auxiliary files have changed. It is based on MD5 checksum \
provided by pdfTeX, LuaTeX, XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-2023.201.1.10svn63869-53.2.noarch.rpm"
RPM_HASH = "907a22e0eb450c3a270340ebfbbd6bee75c89f8a68b9a2ea0aef99235b2ea19da90c009ed48d6340c53a9907812196d0a7af9762761bd953826ce0e0ea156eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rerunfilecheck.sty \
texlive-rerunfilecheck"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-infwarerr.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-uniquecounter.sty \
texlive \
texlive-atveryend \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-uniquecounter"

inherit rpm
