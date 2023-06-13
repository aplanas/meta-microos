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

PV = "2023.201.1.29svn64477"

RPM_NAME = "texlive-latex2man-2023.201.1.29svn64477-54.1.noarch.rpm"
RPM_HASH = "ad8cc1b736189515fc1a2644c1176ae1a68678dbb8562a2e2350c2924a8932b6f41dd42e3855c4ee5094b4a64ee570b8418b21bf55fbf554ab241b3c5b080499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latex2man.cfg) \
tex(latex2man.sty) \
texlive-latex2man"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(File::Basename) \
perl(Getopt::Std) \
sed \
tex(fancyhdr.sty) \
tex(fancyheadings.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex2man-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
