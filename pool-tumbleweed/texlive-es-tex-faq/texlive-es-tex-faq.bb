SUMMARY = "CervanTeX (Spanish TeX Group) FAQ"
DESCRIPTION = "SGML source, converted LaTeX version, and readable copies of \
the FAQ from the Spanish TeX users group."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.97svn15878"

RPM_NAME = "texlive-es-tex-faq-2023.209.1.97svn15878-54.2.noarch.rpm"
RPM_HASH = "e7a0fe26d78edff34825a0c2930e9a9723122280a75ffa807fce5964c81969257d245760a7cf1120c5a11fcda28ca5b3c540fae19b5d9c9acfb85a810f75821c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-es-tex-faq"

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
