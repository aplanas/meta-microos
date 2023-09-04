SUMMARY = "Expandable macros that take an optional argument"
DESCRIPTION = "Commands that take an optional argument are not ordinarily \
expandable; this package allows such commands to be expandable \
provided that they have at least one mandatory argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-xoptarg-2023.209.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "f2f2729e9312f335c09fd500c95ad6669ef0753bbdad8a5d088a72edea05d4104b433ad98be8638207c81cc258ba7222f17b5694dd17fa761f0e35cd08124e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xoptarg.sty \
texlive-xoptarg"

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
