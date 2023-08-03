SUMMARY = "Slides with a simple Power Point like appearance"
DESCRIPTION = "A slide format which produces slides with a simple Power Point \
like appearance. Several useful features include: use of \
standard titlepage to produce title slide; several slide \
environments including plain (page with a title), double slide \
(two column page with slide title), item slide (item list with \
title), left item slide, and right item slide. Logos are placed \
in the upper left corner of each slide if the logo file \
logo.eps is present. Preconfigured in landscape mode by default \
and uses Times Roman by default (originally, it was claimed, \
for simple conversion to PDF format)."
LICENSE = "Artistic-1.0"

PV = "2023.209.svn27354"

RPM_NAME = "texlive-uwmslide-2023.209.svn27354-54.1.noarch.rpm"
RPM_HASH = "7f7723bf24c16340a0a60e9e43a2a712eca36e21057fed4fe59060b3ef6eb83d1f4b230c8106d4fd770a90f250fc1d9cd53711b31ecee82f9a8209c14e670dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwmslide.cls \
texlive-uwmslide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-epsfig.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
