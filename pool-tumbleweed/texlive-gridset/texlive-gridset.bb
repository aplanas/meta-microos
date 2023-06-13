SUMMARY = "Grid, a.k.a. in-register, setting"
DESCRIPTION = "Grid setting -- also known as strict in-register setting -- is \
something, that should be done for a lot of documents but is \
not easy using LaTeX. The package helps to get the information \
needed for grid setting. It does not implement auto grid \
setting, but there is a command \\vskipnextgrid, that moves to \
the next grid position. This may be enough under some \
circumstances, but in other circumstances it may fail. Thus \
gridset is only one more step for grid setting, not a complete \
solution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn53762"

RPM_NAME = "texlive-gridset-2023.201.0.0.3svn53762-53.1.noarch.rpm"
RPM_HASH = "1cc20e5642c2374ca999169153f861960f53937f541320df1846fb1bccc6fda6fcfb253447e2c1b98f0ae730b8dbf6782e5567ef36d74367de9cfeddb289a5c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gridset.sty) \
texlive-gridset"

RDEPENDS:${PN} += "/bin/sh \
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
