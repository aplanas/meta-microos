SUMMARY = "Subversion keywords in multi-file LaTeX documents"
DESCRIPTION = "This package lets you typeset keywords of the version control \
system Subversion inside your LaTeX files anywhere you like. \
Unlike the otherwise similar package svn the use of multiple \
files for one LaTeX document is well supported. The package \
uses the author's filehook and currfile packages. The package \
interacts with an external Perl script, to retrieve information \
necessary for the required output."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4dsvn64967"

RPM_NAME = "texlive-svn-multi-2023.201.2.4dsvn64967-57.1.noarch.rpm"
RPM_HASH = "036dea4707cf7db169e1aae6dd74bb1ca2c581018a99ccdfa6b85027eaf039d2e4ba14b68dd549b5d19faecc5b37304927820f6359069fbf4fd5705f59018148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn-multi.sty \
tex-svnkw.sty \
texlive-svn-multi"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Date--Format \
perl-Date--Parse \
perl-File--Basename \
perl-strict \
perl-warnings \
sed \
tex-currfile.sty \
tex-filehook.sty \
tex-graphics.sty \
tex-kvoptions.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svn-multi-bin"

inherit rpm
