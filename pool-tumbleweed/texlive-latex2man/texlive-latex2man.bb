SUMMARY = "Translate LaTeX-based manual pages into Unix man format"
DESCRIPTION = "Latex2man is a tool to translate UNIX manual pages written with \
LaTeX into the troff format understood by the UNIX man(1) \
command. Alternatively HTML, TexInfo, or LaTeX code can be \
produced too. Output of parts of the text may be supressed \
using the conditional text feature (for this, LaTeX generation \
may be used). There is a LaTeX package (latex2man.sty) for \
writing the man page and a Perl script (latex2man) that does \
the actual translation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.29svn64477"

RPM_NAME = "texlive-latex2man-2023.209.1.29svn64477-55.1.noarch.rpm"
RPM_HASH = "de3957f483315a0f51d38f0bf72acb082bf4b66a82f369dbd3478ec900c151e811be1880c61e70d54a88d44600e5a325767ddc802163382d53ac71e56af837e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex2man.cfg \
tex-latex2man.sty \
texlive-latex2man"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-Getopt--Std \
sed \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex2man-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
