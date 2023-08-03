SUMMARY = "Table heads with diagonal lines"
DESCRIPTION = "The package's principal command, \\diagbox, takes two arguments \
(texts for the slash-separated parts of the box), and an \
optional argument with which the direction the slash will go, \
the box dimensions, etc., may be controlled. The package also \
provides \\slashbox and \\backslashbox commands for compatibility \
with the slashbox package, which it supersedes. diagbox depends \
on e-TeX as well as the packages array, calc, fp, keyval, and \
pict2e."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn54080"

RPM_NAME = "texlive-diagbox-2023.209.2.4svn54080-53.1.noarch.rpm"
RPM_HASH = "a789dcb15c75add2f784bf05c48cacb30689300d5569a6fe56742542adaf539337a7dc730b63886dfb0d733775f2c868d44b3a03614b0f544af9ff79233b91dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagbox.sty \
texlive-diagbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-fp.sty \
tex-keyval.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
