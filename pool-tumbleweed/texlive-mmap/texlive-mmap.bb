SUMMARY = "Include CMap resources in PDF files from pdfTeX"
DESCRIPTION = "The package is an extension of cmap with improved flexibility \
and coverage, including the ability to re-encode Knuth's basic \
mathematics fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn15878"

RPM_NAME = "texlive-mmap-2023.209.1.03svn15878-55.1.noarch.rpm"
RPM_HASH = "9a5ddac91258cc42b63eb4a27532bda3c8199c580f5e3e4bbd767d9fb5baaffb4a35c3c4c1e20582b73618516d2e3619d54eadb6c9762f268982f7c1775ce333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mmap.sty \
texlive-mmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmap.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
