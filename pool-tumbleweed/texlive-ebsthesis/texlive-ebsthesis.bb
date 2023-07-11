SUMMARY = "Typesetting theses for economics"
DESCRIPTION = "The ebsthesis class and ebstools package facilitate the \
production of camera-ready manuscripts in conformance with the \
guidelines of Gabler Verlag and typographical rules established \
by the European Business School."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "e326f645e908931af91fa9bc8a7c0d345e49d5bd12ffec60797fafe42acec3acbdab600ae6cabb41ca1b8229ffad8f2ba7f8cb17e70cdfda5dd0b45f1929e035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebsthesis.cls \
texlive-ebsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-calc.sty \
tex-caption.sty \
tex-comment.sty \
tex-dsfont.sty \
tex-extbook.cls \
tex-geometry.sty \
tex-ifthen.sty \
tex-mdwlist.sty \
tex-nomencl.sty \
tex-onlyamsmath.sty \
tex-ragged2e.sty \
tex-remreset.sty \
tex-rotfloat.sty \
tex-setspace.sty \
tex-titletoc.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
