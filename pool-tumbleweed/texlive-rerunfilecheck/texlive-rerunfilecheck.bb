SUMMARY = "Checksum based rerun checks on auxiliary files"
DESCRIPTION = "The package provides additional rerun warnings if some \
auxiliary files have changed. It is based on MD5 checksum \
provided by pdfTeX, LuaTeX, XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-2023.209.1.10svn63869-54.1.noarch.rpm"
RPM_HASH = "0185c7cac47b3410f5429fe6d0c6577af55889137c65779e348e2666480e694ec633e239ac4e29c80124a1de82bc3cace8b1a864c7a5119c91cacd25b448fffc"
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
