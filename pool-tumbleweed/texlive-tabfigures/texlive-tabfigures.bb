SUMMARY = "Maintain vertical alignment of figures"
DESCRIPTION = "Knuth designed his original fonts with tabular figures (figures \
whose width is uniform); this makes some layout problems rather \
simple. In more recent times, fonts (such as Minion Pro), which \
offer proportionally spaced figures, are increasingly being \
used. The package provides mechanisms whereby such proportional \
figures may still be aligned in tabular style (for example, in \
the table of contents)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn25202"

RPM_NAME = "texlive-tabfigures-2023.209.1.1svn25202-58.1.noarch.rpm"
RPM_HASH = "16960f9e9abb1231e2a2c7a285ec6ea39f357fc222c935ed4ac10ac25cabc98b5390f0f3d489b2af39116dae85c4a48bced31a962a295be2eb1f4157507aa157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabfigures.sty \
texlive-tabfigures"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
