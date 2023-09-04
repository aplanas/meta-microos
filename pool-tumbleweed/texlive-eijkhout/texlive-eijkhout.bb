SUMMARY = "Victor Eijkhout's packages"
DESCRIPTION = "Three unrelated packages: DB_process, to parse and process \
database output; CD_labeler, to typeset user text to fit on a \
CD label; and repeat, a nestable, generic loop macro."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eijkhout-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "e779b35b092fd6460f35632d0c7f3bbd6cad3e4988800d216783f5103867a7df2ac3e6acee4ad09f7991f31efeb2c27d80b1ff5cbb32dabdbdac11ec0717a8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CD-labeler-test.tex \
tex-CD-labeler.tex \
tex-DB-process.tex \
tex-repeat.tex \
texlive-eijkhout"

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
