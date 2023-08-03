SUMMARY = "Macros to print two-up"
DESCRIPTION = "The 2up package offers considerable flexibility as to paper \
size and layout, and produces a standard dvi file without \
involving additional dvi or PostScript filters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn55076"

RPM_NAME = "texlive-2up-2023.209.1.3asvn55076-55.1.noarch.rpm"
RPM_HASH = "2d751ae5d7ca4691260c144db8179bcc31cf489354e6241cf5b81df05dfb134508be7ef0937b38e916cac55501d65e59bebc26d5ce206ba545031e0b141f4c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2up.sty \
tex-2up.tex \
texlive-2up"

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
