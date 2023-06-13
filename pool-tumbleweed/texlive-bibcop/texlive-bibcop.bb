SUMMARY = "Style checker for .bib files"
DESCRIPTION = "This LaTeX package checks the quality of your .bib file and \
emits warning messages if any issues are found. For this, the \
TeX processor must be run with the --shell-escape option, and \
Perl must be installed. bibcop.pl can also be used as a \
standalone command line tool. The package does not work on \
Windows."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.9svn65816"

RPM_NAME = "texlive-bibcop-2023.201.0.0.0.9svn65816-53.1.noarch.rpm"
RPM_HASH = "e6c2f29c402e98780476bc92aea5154779d48530738b7134352eb55c3bd926b0117c053d86e74dae5418a222ad7cf0fde2984fe74d08f0a6a136a2be7d5a1eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibcop.sty) \
texlive-bibcop"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(strict) \
perl(warnings) \
sed \
tex(iexec.sty) \
tex(pgfopts.sty) \
texlive \
texlive-bibcop-bin \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
