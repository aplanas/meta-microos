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

PV = "2023.209.1.1svn29725"

RPM_NAME = "texlive-purifyeps-2023.209.1.1svn29725-54.1.noarch.rpm"
RPM_HASH = "a6a0f7da1c6a63018d890ee3798c3bb5e88969c39faea9e754e789384685b00327598c139b81de044bf24db965cde7edb337fc6c174a5757915df6367af1cb4d"
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
