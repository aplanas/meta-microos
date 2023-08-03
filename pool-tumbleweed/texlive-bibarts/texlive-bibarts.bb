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

PV = "2023.209.2.5svn64579"

RPM_NAME = "texlive-bibarts-2023.209.2.5svn64579-54.1.noarch.rpm"
RPM_HASH = "b02423a41ef0572d882517ffe614f3fead44ab2840f15d8c22b87942908e2ea8131728eae16b9964b9cab841be00f68617c6bb19e777a7567f11487910715102"
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
