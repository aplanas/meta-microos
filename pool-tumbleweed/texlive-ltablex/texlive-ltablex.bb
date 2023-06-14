SUMMARY = "Table package extensions"
DESCRIPTION = "Modifies the tabularx environment to combine the features of \
the tabularx package (auto-sized columns in a fixed width \
table) with those of the longtable package (multi-page tables)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34923"

RPM_NAME = "texlive-ltablex-2023.201.1.1svn34923-52.1.noarch.rpm"
RPM_HASH = "e1a49def4948e888ceae31371080000f0e7a99e0fc06ef3088605fd273ed5d3d6cd5e54e7f1bcee4bdfc5d552669167ae0c9f89f9044ca0a5fed3de132378181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltablex.sty \
texlive-ltablex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
