SUMMARY = "Generate sentences from economic articles"
DESCRIPTION = "This package is a blind text generator that ouputs sentences \
inferred from abstracts of economic articles. All the \
paragraphs are taken with permission from \
https://ipsum.mwt.me/."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-2023.209.0.0.8.2svn58390-54.1.noarch.rpm"
RPM_HASH = "b03450e48912ce13913101f3c78cae8f4da0750a3683671e2e3e00eece9d3763ddc13fc29bf1220989a21249dfb77cb6f0899c07b15276a5997cd5faa2ddcfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-econlipsum.sty \
texlive-econlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
