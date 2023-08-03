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

PV = "2023.209.2.0svn49362"

RPM_NAME = "texlive-texdate-2023.209.2.0svn49362-55.1.noarch.rpm"
RPM_HASH = "a44347048d12eb917c6c8291f17e2292ef184e00f716fedb478b3f517442de04f325f379402ce74595db9116d9f52b52bedd3b70be752a1354a0a0ea362f99dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdate.sty \
texlive-texdate"

RDEPENDS:${PN} += "/usr/bin/sh \
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
