SUMMARY = "Get data from Excel files into LaTeX"
DESCRIPTION = "Exceltex is a LaTeX package combined with a helper program \
written in Perl. It provides an easy to use yet powerful and \
flexible way to get data from Spreadsheets into LaTeX. In \
contrast to other solutions, exceltex does not seek to make the \
creation of tables in LaTeX easier, but to get data from \
Spreadsheets into LaTeX as easily as possible. The Excel (TM) \
file format only acts as an interface between the spreadsheet \
application and exceltex beacause it is easily accessible (via \
the Spreadsheet::ParseExcel Perl module) and because most \
spreadsheet applications are able to read and write Excel \
files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.1svn26313"

RPM_NAME = "texlive-exceltex-2023.209.0.0.5.1svn26313-53.1.noarch.rpm"
RPM_HASH = "f7a934e228dad2087ca2a5caa7fe6fd1ae09d7490dfa188119b0428b408241a121ebadf8c44eb242801078f3c1d91ba4cbb8f8ceb30e92d0cb026cd43a63fb2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exceltex.sty \
texlive-exceltex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Encode \
perl-Getopt--Long \
perl-Spreadsheet--ParseExcel \
perl-strict \
sed \
tex-color.sty \
tex-ulem.sty \
texlive \
texlive-exceltex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
