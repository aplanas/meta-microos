SUMMARY = "Date printing, formatting, and manipulation in TeX"
DESCRIPTION = "TeX and LaTeX provide few facilities for dates by default, \
though many packages have filled this gap. This package fills \
it, as well, with a pure TeX-primitive implementation. It can \
print dates, advance them by numbers of days, weeks, or months, \
determine the weekday automatically (with an algorithm cribbed \
from the dayofweek.tex file written by Martin Minow), and print \
them in (mostly) arbitrary format. It can also print calendars \
(monthly and yearly) automatically, and can be easily localized \
for non-English languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn49362"

RPM_NAME = "texlive-texdate-2023.201.2.0svn49362-54.1.noarch.rpm"
RPM_HASH = "30044effb8331e9d910d8b329d2537f786ec356b0226c126dbde2517b9da799f8e7a1869e149ff3ef66d4951780fd11db0b3f539b3646c271ed1cd29ada4cc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdate.sty \
texlive-texdate"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iflang.sty \
tex-modulus.sty \
tex-padcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
