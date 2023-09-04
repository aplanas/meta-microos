SUMMARY = "Checksum based rerun checks on auxiliary files"
DESCRIPTION = "The package provides additional rerun warnings if some \
auxiliary files have changed. It is based on MD5 checksum \
provided by pdfTeX, LuaTeX, XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-2023.209.1.10svn63869-54.2.noarch.rpm"
RPM_HASH = "4f55b06cb490b573de71e8d7dacf24a12e27480cc7df0ea02c5ac09eb630a3b20a56e83999341cd1b0c0d85b61712c839f24cecd0ae57a6b9417074ba7e19241"
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
