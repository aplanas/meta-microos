SUMMARY = "Bulgarian translation of the 'Short Introduction to LaTeX2e'"
DESCRIPTION = "The source files, PostScript and PDF files of the Bulgarian \
translation of the 'Short Introduction to LaTeX 2e'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-lshort-bulgarian-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "22fbc8d95b3fe5300d45eb5d1ee575d1249686491ac4de4bd96390e61f127c81060720a7558f8c93778b71e81f9f6afecf9f144345c3bf0b52ecc0dc649e6a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-bulgarian"

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
