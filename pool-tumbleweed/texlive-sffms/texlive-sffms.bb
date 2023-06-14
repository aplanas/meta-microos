SUMMARY = "Typesetting science fiction/fantasy manuscripts"
DESCRIPTION = "The class is designed for typesetting science fiction and \
fantasy manuscripts. Sffms now includes several options for \
specific publishers as well as extensive documentation aimed at \
new LaTeX users."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-sffms-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "18617444ec62512764c22908e49ff99a923152768298e27747517ef62b5f42ed957ed9287dd65a5f7a958d0683374bd27b13231d1ac403e41d28c49ae56ad108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sffdumb.sty \
tex-sffms.cls \
tex-sffsmart.sty \
texlive-sffms"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-report.cls \
tex-setspace.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
