SUMMARY = "Make EPS work with both LaTeX/dvips and pdfLaTeX"
DESCRIPTION = "While pdfLaTeX has a number of nice features, its primary \
shortcoming relative to standard LaTeX+dvips is that it is \
unable to read ordinary Encapsulated PostScript (EPS) files, \
the most common graphics format in the LaTeX world. Purifyeps \
converts EPS files into a 'purified' form that can be read by \
both LaTeX+dvips and pdfLaTeX. The trick is that the standard \
LaTeX2e graphics packages can parse MetaPost-produced EPS \
directly. Hence, purifyeps need only convert an arbitrary EPS \
file into the same stylized format that MetaPost outputs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn29725"

RPM_NAME = "texlive-purifyeps-2023.201.1.1svn29725-53.2.noarch.rpm"
RPM_HASH = "3ce77c20c5efe42b8a569b97081c81d14e0b2f8569ba3e9aeb82ab011a263900ee4e815f2265eba47f5cebfb1aa17c38ed0b26cb7da12da0a54681ccb1aaa438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-purifyeps"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-English \
perl-File--Basename \
perl-File--Spec \
perl-File--Temp \
perl-File--Which \
perl-FindBin \
perl-Getopt--Long \
perl-POSIX \
perl-Pod--Man \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-purifyeps-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
