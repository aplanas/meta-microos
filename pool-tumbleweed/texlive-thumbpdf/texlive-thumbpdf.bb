SUMMARY = "Thumbnails for pdfTeX and dvips/ps2pdf"
DESCRIPTION = "A Perl script that provides support for thumbnails in pdfTeX \
and dvips/ps2pdf. The script uses ghostscript to generate the \
thumbnails which get represented in a TeX readable file that is \
read by the package thumbpdf.sty to automatically include the \
thumbnails. This arrangement works with both plain TeX and \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.17svn62518"

RPM_NAME = "texlive-thumbpdf-2023.201.3.17svn62518-54.1.noarch.rpm"
RPM_HASH = "98509902be9d3fb564304eeea900abdd692769a4c874808dd56b533f1616eb87f92010033554cba3bbd3e1a960da6872b364d62abc684edc22ed1378245d9717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumbpdf.sty \
tex-thumbpdf.tex \
texlive-thumbpdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-Getopt--Long \
perl-strict \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-thumbpdf-bin"

inherit rpm
