SUMMARY = "Conversion of graphics to pdfLaTeX-compatible formats"
DESCRIPTION = "The package facilitates the on-the-fly conversion of various \
graphics formats to formats supported by pdfLaTeX (e.g. PDF). \
It uses a range of external programs, and therefore requires \
that the LaTeX run starts with write18 enabled."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32377"

RPM_NAME = "texlive-autopdf-2023.201.1.1svn32377-53.1.noarch.rpm"
RPM_HASH = "291b1803adef42ab7be7e940b08f211f8a7170f5e898b8ac74270795d2940bf7f9f43d032ae37d218a9822a1c6600c1809c98b97415c37d0f2b8af80ef26fb01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopdf.sty \
texlive-autopdf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
