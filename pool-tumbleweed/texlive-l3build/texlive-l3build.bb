SUMMARY = "A testing and building system for (La)TeX"
DESCRIPTION = "The build system supports testing and building LaTeX3 code, on \
Linux, Mac OS X and Windows systems. The package offers: A unit \
testing system for (La)TeX code (whether kernel code or \
contributed packages); A system for typesetting package \
documentation; and An automated process for creating CTAN \
releases. The package is essentially independent of other \
material released by the LaTeX3 team, and may be updated on a \
different schedule."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66471"

RPM_NAME = "texlive-l3build-2023.209.svn66471-56.1.noarch.rpm"
RPM_HASH = "e68a70550ab85a9237be09e6b964a951e78dfbc611513d61ec52ac735616a24dda3670f1f6100bb1649f94ba16d4792114218fec83949127829f5d04199e6c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regression-test.tex \
texlive-l3build"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3build-bin \
texlive-luatex \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
