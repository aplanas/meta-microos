SUMMARY = "TeX macros for typesetting complex tables"
DESCRIPTION = "The package offers a simple notation for pretty complex tables \
(to Michael J. Ferguson's credit). With PostScript, the package \
allows shaded/coloured tables, diagonal rules, etc. The package \
is supposed to work with both Plain and LaTeX. An AWK converter \
from ASCII semigraphic tables to TAP notation is included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.77svn31731"

RPM_NAME = "texlive-tap-2023.209.0.0.77svn31731-55.1.noarch.rpm"
RPM_HASH = "dec97ed352fa297a8ff2659d52765f90d64c35dfb85adbb228e7db8e1be2c29d5968448044ad3583474702fa69e12ca87a8db5d6f8a765a1e69fa407ba9a05ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tap.tex \
texlive-tap"

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
