SUMMARY = "A set of macros for various transformations of TeX boxes"
DESCRIPTION = "pdf-trans is a set of macros offering various transformations \
of TeX boxes (based on plain and pdfeTeX primitives). It was \
initially inspired by trans.tex, remade to work with pdfTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.4svn32809"

RPM_NAME = "texlive-pdf-trans-2023.209.2.4svn32809-52.1.noarch.rpm"
RPM_HASH = "5db90b007a01350faeee8a271df72447b4a03c18aa61d2574ccbfc76a73a434f8044658034ea12524de3ac689cc0b88747ebf2e5d3882b54338cc78cb5f63094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdf-trans.tex \
texlive-pdf-trans"

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
