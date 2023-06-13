SUMMARY = "Monthly Notices of the Royal Astronomical Society"
DESCRIPTION = "Package for preparing papers in the journal 'Monthly Notices of \
the Royal Astronomical Society'."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn55729"

RPM_NAME = "texlive-mnras-2023.201.3.1svn55729-54.1.noarch.rpm"
RPM_HASH = "c1a0fc1314e7d50f3e56ace317d48c285bc6c465335948f36629d5d9ca0d1da4d10f3ea0fb87373b1787378cb8c6f2b0228055f2148959451be2ca9742db35c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mnras.cls) \
texlive-mnras"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(dcolumn.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(natbib.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
