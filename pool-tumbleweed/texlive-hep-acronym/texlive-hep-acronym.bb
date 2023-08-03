SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-acronym package provides an acronym macro based on the \
glossaries package. The package is loaded with \
\\usepackage{hep-acronym}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-2023.209.1.1svn64890-54.1.noarch.rpm"
RPM_HASH = "8d57745e34065242dcdbe6f6227cc12ac62ae014ca1fb89327cf0bae4c6e1ba422373bd4c489f75763acafb9876e65bc76771805115b7e860eae36fdb8094cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-acronym.sty \
texlive-hep-acronym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-everyhook.sty \
tex-glossaries-extra.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
