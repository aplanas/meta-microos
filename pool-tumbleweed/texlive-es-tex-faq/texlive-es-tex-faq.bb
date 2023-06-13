SUMMARY = "CervanTeX (Spanish TeX Group) FAQ"
DESCRIPTION = "SGML source, converted LaTeX version, and readable copies of \
the FAQ from the Spanish TeX users group."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.97svn15878"

RPM_NAME = "texlive-es-tex-faq-2023.201.1.97svn15878-53.1.noarch.rpm"
RPM_HASH = "9bef66848aac6d68f6d38f781ade0a5622fb875e2cd9df0401c562e2af1611f40c73c92615ee14a5de0cdd096d983563803b7f66ce8143c6f07bf694e9f74991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-es-tex-faq"

RDEPENDS:${PN} += "/bin/sh \
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
