SUMMARY = "Low-level PDF integration for LuaTeX"
DESCRIPTION = "This package adds low-level support to plain LuaTeX for marking \
up the structure of a PDF document. The implementation is \
rather basic, but should allow you to make your PDFs fully \
PDF/A-compliant."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-pdf-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "a3b20e29de5868747f002366ade3373781a9f5221a4a5848cd7506eace801b055deb1584cb9489d705994dc4c16e85b326aecc2aed7e0cb2a8861950c50bc0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-pdf.tex \
texlive-minim-pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
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
