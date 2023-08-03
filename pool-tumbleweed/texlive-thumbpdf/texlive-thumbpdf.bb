SUMMARY = "Thumbnails for pdfTeX and dvips/ps2pdf"
DESCRIPTION = "A Perl script that provides support for thumbnails in pdfTeX \
and dvips/ps2pdf. The script uses ghostscript to generate the \
thumbnails which get represented in a TeX readable file that is \
read by the package thumbpdf.sty to automatically include the \
thumbnails. This arrangement works with both plain TeX and \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.17svn62518"

RPM_NAME = "texlive-thumbpdf-2023.209.3.17svn62518-55.1.noarch.rpm"
RPM_HASH = "11b483c30605d077d903657398a9ea03a079fffc55bc0777cfe30dbda7ef1cb7b6aacb05f7ba746b60126e8278ef835be9f603f109cb446552d8c29b25a8c206"
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
