SUMMARY = "Provide \\listfiles alignment"
DESCRIPTION = "The package extends longnamefilelist, keeping separate columns \
for date, version and 'caption' (the caption now separately \
listed). Alignment is not disturbed by short file name \
extensions, such as '.fd'. The package is not compatible with \
longnamefilelist: users need to re-read the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9bsvn65842"

RPM_NAME = "texlive-nicefilelist-2023.209.0.0.9bsvn65842-55.1.noarch.rpm"
RPM_HASH = "2f5264b7ae6a7362f36870c41dc8c69eeac841504a702cfb4d0bb887d1fe52ab2d3d8828c27b631caebf3fe7cd4f89cf8ae02cffbd837e1e387a576a681c5485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicefilelist.sty \
texlive-nicefilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hardwrap.sty \
tex-monofill.sty \
tex-myfilist.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
