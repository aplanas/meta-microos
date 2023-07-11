SUMMARY = "Unicode compatible index generation"
DESCRIPTION = "This package provides a unicode compatible index programm for \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.47svn65597"

RPM_NAME = "texlive-xindex-2023.201.0.0.47svn65597-52.2.noarch.rpm"
RPM_HASH = "6e616575e7cad27c74c5e95320b4ad5ac6da33a6be4e3746c7a9044f987f27f32f9a74122b09f4f761043c2e1cdda772ae52998507624495c59368e28a3fea45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xindex.sty \
texlive-xindex"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-imakeidx.sty \
tex-makeidx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xindex-bin"

inherit rpm
