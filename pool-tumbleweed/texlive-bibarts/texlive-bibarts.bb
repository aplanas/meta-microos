SUMMARY = "'Arts'-style bibliographical information"
DESCRIPTION = "BibArts is a LaTeX package to assist in making bibliographical \
features common in the arts and the humanities (history, \
political science, philosophy, etc.). bibarts.sty provides \
commands for quotations, abbreviations, and especially for a \
formatted citation of literature, journals (periodicals), \
edited sources, and archive sources. In difference to earlier \
versions, BibArts 2.x helps to use slanted fonts (italics) and \
is able to set ibidem automatically in footnotes. It will also \
copy all citation information, abbreviations, and register key \
words into lists for an automatically generated appendix. These \
lists may refer to page and footnote numbers. BibArts has \
nothing to do with BibTeX. The lists are created by bibsort \
(see below). BibArts requires the program bibsort, for which \
the sources and a Windows executable are provided. This program \
creates the bibliography without using MakeIndex or BibTeX. Its \
source is not written with any specific operating system in \
mind. A summary of contents is in English; the full \
documentation is in German."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.5svn64579"

RPM_NAME = "texlive-bibarts-2023.201.2.5svn64579-53.1.noarch.rpm"
RPM_HASH = "eafd18d3ac4bb89b859aff225cf9cf9760eab3f64ef31c5f0be587aae9ca1e28debd18a66888fecd923bae1954617f612e309cb67e48eea73dab674822fe7a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibarts.sty \
texlive-bibarts"

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
