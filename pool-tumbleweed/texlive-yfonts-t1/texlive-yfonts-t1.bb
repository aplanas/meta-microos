SUMMARY = "Old German-style fonts, in Adobe type 1 format"
DESCRIPTION = "This package comprises type 1 versions of the Gothic, \
Schwabacher and Fraktur fonts of Yannis Haralambous' set of old \
German fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-2023.201.1.0svn36013-52.2.noarch.rpm"
RPM_HASH = "8444bba0b332eee6e7f33cf8d53032b5f58145758000e260c5b8a36f127292926df060a3136300b03fef188a88e178c0316b23ee893ce861ef874f9814a5e30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yfrak.map \
texlive-yfonts-t1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yfonts-t1-fonts"

inherit rpm
