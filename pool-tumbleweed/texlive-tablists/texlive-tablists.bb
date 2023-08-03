SUMMARY = "Tabulated lists of short items"
DESCRIPTION = "This package offers environments and commands for one-level and \
two-level lists of short items (e.g., exercises in textbooks). \
The environments support optional arguments of item numbering \
similar to the enumerate or paralist packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0esvn15878"

RPM_NAME = "texlive-tablists-2023.209.0.0.0esvn15878-55.1.noarch.rpm"
RPM_HASH = "e2fcede309393850fdce1604011ff9db6512ac5a4264ee070d7d1064eda821ec2ce3b7d287821ccf7ca47558947cee179e3c261ef85f2dffa7a2829efecdac9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablists.sty \
texlive-tablists"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makecell.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
