SUMMARY = "Checksum based rerun checks on auxiliary files"
DESCRIPTION = "The package provides additional rerun warnings if some \
auxiliary files have changed. It is based on MD5 checksum \
provided by pdfTeX, LuaTeX, XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-2023.201.1.10svn63869-53.1.noarch.rpm"
RPM_HASH = "a507e6d07a97f4c6199f698c833592f7d2fc4b323e9d31141f53e69f0050b5b869cc5e356b2b3819daa23474dec8d3025032d9a48e22417c9ea22f4f0cb5c32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rerunfilecheck.sty) \
texlive-rerunfilecheck"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atveryend.sty) \
tex(infwarerr.sty) \
tex(kvoptions.sty) \
tex(pdftexcmds.sty) \
tex(uniquecounter.sty) \
texlive \
texlive-atveryend \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-uniquecounter"

inherit rpm
