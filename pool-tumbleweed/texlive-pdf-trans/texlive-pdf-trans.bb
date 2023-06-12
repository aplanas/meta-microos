SUMMARY = "A set of macros for various transformations of TeX boxes"
DESCRIPTION = "pdf-trans is a set of macros offering various transformations \
of TeX boxes (based on plain and pdfeTeX primitives). It was \
initially inspired by trans.tex, remade to work with pdfTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.4svn32809"

RPM_NAME = "texlive-pdf-trans-2023.201.2.4svn32809-51.1.noarch.rpm"
RPM_HASH = "602e3dff3c7bb726149f056806074199109a884435ff894bc9b81132b83c725e534cfd5562d2eb554bb72f3242ec8dd9d9b67b9f655c018e1e141f4209660c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdf-trans.tex) \
texlive-pdf-trans"
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
