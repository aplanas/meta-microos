SUMMARY = "Subversion keywords in multi-file LaTeX documents"
DESCRIPTION = "This package lets you typeset keywords of the version control \
system Subversion inside your LaTeX files anywhere you like. \
Unlike the otherwise similar package svn the use of multiple \
files for one LaTeX document is well supported. The package \
uses the author's filehook and currfile packages. The package \
interacts with an external Perl script, to retrieve information \
necessary for the required output."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4dsvn64967"

RPM_NAME = "texlive-svn-multi-2023.209.2.4dsvn64967-58.1.noarch.rpm"
RPM_HASH = "b70209d878fabbbb0012768af0cccc0704d510da3b7ac5971e157ab1a7fba7647dc01a8f91465dd0b4b480dd7c3e57fe2625d6209cfe3cd7c2f4d59e2663fa4d"
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
