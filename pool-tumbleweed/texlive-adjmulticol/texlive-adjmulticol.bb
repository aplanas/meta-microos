SUMMARY = "Adjusting margins for multicolumn and single column output"
DESCRIPTION = "The package adds, to the multicol package, the option to change \
the margins for multicolumn and unicolumn layout. The package \
understands the difference between the even and odd margins for \
two side printing."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn63320"

RPM_NAME = "texlive-adjmulticol-2023.209.1.5svn63320-55.1.noarch.rpm"
RPM_HASH = "58b0e43f89484e243e2c20b2f4f94edbd2ad0087f73b5a74170c3eb2625ecf587805297104efe61d297507a34ea4c9e9455925ccf51352f46eb8a927e15eb99e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adjmulticol.sty \
texlive-adjmulticol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
