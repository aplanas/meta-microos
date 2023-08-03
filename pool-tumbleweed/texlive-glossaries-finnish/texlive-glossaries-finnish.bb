SUMMARY = "Finnish language module for glossaries package"
DESCRIPTION = "Finnish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-2023.209.1.0svn54080-54.1.noarch.rpm"
RPM_HASH = "a6658976d2ddc277838c730f6a7bf594966cf4940d1ad95c1f9bececcbfcd751cb3f54583e725341195c90ed511f8af0243202e558c2200e99b3034c535e0737"
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
