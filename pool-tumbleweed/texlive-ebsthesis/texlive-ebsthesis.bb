SUMMARY = "Typesetting theses for economics"
DESCRIPTION = "The ebsthesis class and ebstools package facilitate the \
production of camera-ready manuscripts in conformance with the \
guidelines of Gabler Verlag and typographical rules established \
by the European Business School."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "aee03b8dcb39dadc3446020246d2fdcf9b12331f302bc4a0cc5b55db702d6b315b4e1a5471d8b1c875858ac073c96a20c631429737506f59cab61de0a4985f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ebsthesis.cls) \
texlive-ebsthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(acronym.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(array.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(comment.sty) \
tex(dsfont.sty) \
tex(extbook.cls) \
tex(geometry.sty) \
tex(ifthen.sty) \
tex(mdwlist.sty) \
tex(nomencl.sty) \
tex(onlyamsmath.sty) \
tex(ragged2e.sty) \
tex(remreset.sty) \
tex(rotfloat.sty) \
tex(setspace.sty) \
tex(titletoc.sty) \
tex(tocbibind.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
