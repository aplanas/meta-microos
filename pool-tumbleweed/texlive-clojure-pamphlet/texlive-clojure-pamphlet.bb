SUMMARY = "A simple literate programming tool based on clojure's pamphlet system"
DESCRIPTION = "The Clojure pamphlet system is a system based on the Clojure \
literate system. In the Clojure's pamphlet system you have your \
main LaTeX file, which can be compiled regularly. This file \
contains documentation and source code (just like in other \
forms of literate programming). These code snippets are wrapped \
in the chunk environment, hence they can be recognized by the \
tangler in order to extract them. Chunks can be included inside \
each other by the getchunk command (which will be typesetted \
acordingly). Finally, the LaTeX file will be run through the \
tangler to get the desired chunk of code."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn60981"

RPM_NAME = "texlive-clojure-pamphlet-2023.209.1.3svn60981-54.1.noarch.rpm"
RPM_HASH = "558b02259b13c90de8d18f373c34e807a506ea720445a76e3a0c0f1008d5ce97d5b1576994705b9b2341cd34eb8f3e0789872c0da84fd15aa21881e3bb10be26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clojure-pamphlet.sty \
texlive-clojure-pamphlet"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
perl-vars \
perl-warnings \
sed \
tex-hyperref.sty \
tex-listings.sty \
texlive \
texlive-clojure-pamphlet-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
