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

PV = "2023.201.0.0.5.1svn26313"

RPM_NAME = "texlive-exceltex-2023.201.0.0.5.1svn26313-52.1.noarch.rpm"
RPM_HASH = "4176dce51a390edef70247df7c978b11ef4fa41467284e244f729debf912bd9807f4ad652c540a23cdd4756b9c0ad841be74607b31bfedddea4b44419f556c59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(exceltex.sty) \
texlive-exceltex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Encode) \
perl(Getopt::Long) \
perl(Spreadsheet::ParseExcel) \
perl(strict) \
sed \
tex(color.sty) \
tex(ulem.sty) \
texlive \
texlive-exceltex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
