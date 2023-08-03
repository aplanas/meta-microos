SUMMARY = "CervanTeX (Spanish TeX Group) FAQ"
DESCRIPTION = "SGML source, converted LaTeX version, and readable copies of \
the FAQ from the Spanish TeX users group."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.97svn15878"

RPM_NAME = "texlive-es-tex-faq-2023.209.1.97svn15878-54.1.noarch.rpm"
RPM_HASH = "268c28a4a13cb11ef39c74521110265541bc0b2952f41f3bd2379a1453bf2126e5076da603c186f96558115b571bf66930bc74439a19e363ff0a869fd86b5b50"
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
