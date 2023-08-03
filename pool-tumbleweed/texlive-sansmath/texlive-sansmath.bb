SUMMARY = "Maths in a sans font"
DESCRIPTION = "The package defines a new math version sans, and a command \
\\sansmath that behaves somewhat like \\boldmath"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1svn17997"

RPM_NAME = "texlive-sansmath-2023.209.1.1svn17997-54.1.noarch.rpm"
RPM_HASH = "7f8aa9917027d6e1ca29e92f9bdd5fae7e1406d838af2bb99279135d9ba942c5baa664579dd85ba1a5b46dc26a11f421c45a579ddca09cd784d5a260017405c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sansmath.sty \
texlive-sansmath"

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
