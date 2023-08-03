SUMMARY = "Multiple bibliographies within one document"
DESCRIPTION = "The package the creation of references to multiple \
bibliographies within one document. It thus provides \
complementary functionality to packages like bibunits and \
chapterbib, which allow the creation of one bibliography for \
multiple, but different parts of the document. Multibib is \
compatible with inlinebib, natbib, and koma-script."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-multibib-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "8f35f81bcfa33e829112994f92a3a4ee96346f3f87af9b0df7b4cabddd47ef2fb4f226cde207a2d0055179cb1b3a189514e4d1a16df4a77a9ae80436ee3150e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibib.sty \
texlive-multibib"

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
