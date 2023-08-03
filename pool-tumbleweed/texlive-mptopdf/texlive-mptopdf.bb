SUMMARY = "Mpost to PDF, native MetaPost graphics inclusion"
DESCRIPTION = "The mptopdf script does standalone conversion from mpost to \
PDF, using the supp-* and syst-* files. They also allow native \
MetaPost graphics inclusion in LaTeX (via pdftex.def) and \
ConTeXt. They can be used independently of the rest of ConTeXt, \
yet are maintained as part of it. So in TeX Live we pull them \
out to this separate package for the benefit of LaTeX users who \
do not install the rest of ConTeXt. This can be found on CTAN \
in macros/pdftex/graphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65952"

RPM_NAME = "texlive-mptopdf-2023.209.svn65952-55.1.noarch.rpm"
RPM_HASH = "4cb50eb45cf9e54d3b43d0cd961e95ed45c9a2ef1bd17f0c38e70e42e08066d0b7ba13b12f7881407b9c800f96b9e27f8f3ed6d7bdc4bc6e830e05ad75442a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mptopdf.tex \
texlive-mptopdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-File--Basename \
perl-Getopt--Long \
perl-strict \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mptopdf-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
