SUMMARY = "On-the-fly conversion of EPS to PDF"
DESCRIPTION = "The package calls the epstopdf package to convert EPS graphics \
to PDF, on the fly. It servs as a vehicle for passing \
conversion options (such as grayscale, prepress or pdfversion) \
to the epspdf converter."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-2023.201.0.0.61svn18703-53.1.noarch.rpm"
RPM_HASH = "eb8c5c53ba6fb92f5000aa37c163de73333dcec4892cbe40b2a0eae7266901ac47bca60de0a0a0844988ca7bde2a405363a617f23507c1aac6cacaf457f05184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epspdfconversion.sty) \
texlive-epspdfconversion"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(epstopdf-base.sty) \
tex(graphics.sty) \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
