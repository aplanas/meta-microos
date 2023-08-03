SUMMARY = "Style checker for .bib files"
DESCRIPTION = "This LaTeX package checks the quality of your .bib file and \
emits warning messages if any issues are found. For this, the \
TeX processor must be run with the --shell-escape option, and \
Perl must be installed. bibcop.pl can also be used as a \
standalone command line tool. The package does not work on \
Windows."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.9svn65816"

RPM_NAME = "texlive-bibcop-2023.209.0.0.0.9svn65816-54.1.noarch.rpm"
RPM_HASH = "1acef9362e6233b668176e7ce5c6d4200546b25773f664662a9d18c574d57501a8134cf096ffe729ac84f66453dacede97d39e21a9a253135c64efd4fa4e46be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibcop.sty \
texlive-bibcop"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
perl-warnings \
sed \
tex-iexec.sty \
tex-pgfopts.sty \
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
