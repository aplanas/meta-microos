SUMMARY = "Support importing and embellishing scanned documents"
DESCRIPTION = "The bundle provides support for the process of creating \
documents based on pre-TeX-era material that is available as \
scanned pages, only."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05asvn42633"

RPM_NAME = "texlive-scanpages-2023.201.1.05asvn42633-53.1.noarch.rpm"
RPM_HASH = "a0f3b382f68255063026462b2aeb0e0cbc8513aa62d110aeed06eb73ebf5fd347304a1edef9827b595ef3cbfdc769228cfab5b4c2aac7c4e5530706294d1eef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scanpages.map) \
tex(scanpages.sty) \
tex(scanwipe.tfm) \
tex(uscanwipe.fd) \
texlive-scanpages"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fp-basic.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(pgffor.sty) \
tex(updmap.cfg) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scanpages-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
