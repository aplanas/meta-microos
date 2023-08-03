SUMMARY = "Typesetting mathematics in colour, in (La)TeX"
DESCRIPTION = "This is a short paper from the TeXnische Komodie, in German. \
Since the body of the paper is dominated by clear LaTeX coding \
examples, most LaTeX programmers will understand how to achieve \
the results shown in the diagrams, even if they don't \
understand German."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn32954"

RPM_NAME = "texlive-voss-mathcol-2023.209.0.0.1svn32954-54.1.noarch.rpm"
RPM_HASH = "119063e4f60503c8c9870319b47fb7f08a0273c10382f75a59559711cba47edb670516eac3303396757c94fcba028c2de5f88bdb0f7619d0cb32e92787eaf1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-voss-mathcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
