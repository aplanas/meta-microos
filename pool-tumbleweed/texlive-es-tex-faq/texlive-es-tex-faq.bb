SUMMARY = "CervanTeX (Spanish TeX Group) FAQ"
DESCRIPTION = "SGML source, converted LaTeX version, and readable copies of \
the FAQ from the Spanish TeX users group."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.97svn15878"

RPM_NAME = "texlive-es-tex-faq-2023.201.1.97svn15878-53.2.noarch.rpm"
RPM_HASH = "4d54c79234c579816097ad6cae0bce2617d7a8468be1254d998cf02ba40af0cd3640cd5190ff454966e161133907b0aadd78a453d2def4677f1eb726630b8d52"
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
