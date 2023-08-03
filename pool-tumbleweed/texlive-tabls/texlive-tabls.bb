SUMMARY = "Better vertical spacing in tables and arrays"
DESCRIPTION = "Modifies LaTeX's array and tabular environments to keep text \
from touching other text or hlines above or below. Several new \
parameters are defined and some standard macros are re-defined. \
The package slows down compilation of tables, since each entry \
is boxed twice."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5svn17255"

RPM_NAME = "texlive-tabls-2023.209.3.5svn17255-55.1.noarch.rpm"
RPM_HASH = "73f4efe9a7e51a25658601ec78a124f43d04530390e027a6cff563a36b08b6107f8bf4a50f9d4b840a288129a62af19c2f6f46d48287bbc49a2db2712c08be06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabls.sty \
texlive-tabls"

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
