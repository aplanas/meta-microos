SUMMARY = "Typesetting articles for 'Philosophers' Imprint'"
DESCRIPTION = "In its mission statement we read 'Philosophers' Imprint is a \
refereed series of original papers in philosophy, edited by \
philosophy faculty at the University of Michigan, with the \
advice of an international Board of Editors, and published on \
the World Wide Web by the University of Michigan Digital \
Library. The mission of the Imprint is to promote a future in \
which funds currently spent on journal subscriptions are \
redirected to the dissemination of scholarship for free, via \
the Internet'. The class helps authors to typeset their own \
articles in 'Web-ready' format. No assumption is made about the \
fonts available to the author: the class itself is restricted \
to freely available and freely distributed fonts, only."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn56954"

RPM_NAME = "texlive-philosophersimprint-2023.209.1.5svn56954-52.1.noarch.rpm"
RPM_HASH = "fb6c8c8924cda2786095d720398d7988b8b4ca84cb3680c158d91ab1ff487791506445e5e56c9fdafc9f2999c355da276c288b03f16d150b70e0d4189903cfec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-philosophersimprint.cls \
texlive-philosophersimprint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-courier.sty \
tex-fancyhdr.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-ifpdf.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-textcomp.sty \
tex-trajan.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
