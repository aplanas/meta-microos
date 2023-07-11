SUMMARY = "Support for the revision control system"
DESCRIPTION = "A package to extract RCS (Revision Control System) information \
and use it in a LaTeX document. For users of LaTeX2HTML \
rcsinfo.perl is included."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-2023.201.1.11svn15878-53.2.noarch.rpm"
RPM_HASH = "cce83476cf8c7e6ac4e4c5ea9979e3925641c1f6f5957b1f376d5a94289763e7d6b8c0236e036f92ffbb648d8475fb93add5c0d6dd5a6681c0359ed453af0316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcsinfo.cfg \
tex-rcsinfo.sty \
texlive-rcsinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
