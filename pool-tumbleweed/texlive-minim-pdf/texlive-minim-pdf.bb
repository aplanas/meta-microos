SUMMARY = "Low-level PDF integration for LuaTeX"
DESCRIPTION = "This package adds low-level support to plain LuaTeX for marking \
up the structure of a PDF document. The implementation is \
rather basic, but should allow you to make your PDFs fully \
PDF/A-compliant."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-pdf-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "6aa83f6008f82ddb228236ba543c9839bf26f5e1d1efded3c2f3ceae34b6a64cf6749b2fae0c3a56aafd6640c1dd86270b789cfedd3dfcc47eb59ad80cbe25bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-pdf.tex \
texlive-minim-pdf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
