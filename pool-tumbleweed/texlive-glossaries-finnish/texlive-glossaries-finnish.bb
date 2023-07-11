SUMMARY = "Finnish language module for glossaries package"
DESCRIPTION = "Finnish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-2023.201.1.0svn54080-53.2.noarch.rpm"
RPM_HASH = "ade98aefd7e7f83a3584c27901ec952a5bcc2a70a8a9313437e25074de38ffa04046afd443b0b8dd1fc213f7edbe11074fbfa1bdd293f6eea4944c0fa8b4e183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-finnish-ascii.ldf \
tex-glossaries-finnish-utf8.ldf \
tex-glossaries-finnish.ldf \
texlive-glossaries-finnish"

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
