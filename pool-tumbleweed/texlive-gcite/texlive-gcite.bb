SUMMARY = "Citations in a reader-friendly style"
DESCRIPTION = "The package allows citations in the German style, which is \
considered by many to be particularly reader-friendly. The \
citation provides a small amount of bibliographic information \
in a footnote on the page where each citation is made. It \
combines a desire to eliminate unnecessary page-turning with \
the look-up efficiency afforded by numeric citations. The \
package makes use of BibLaTeX, and is considered experimental; \
comment is invited."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn15878"

RPM_NAME = "texlive-gcite-2023.209.1.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "0b6fd8540127d8b069c04664b0e2d714df568ee1fd99eace1301a77ebf19412e434c4ddaab0a2da571ec29bbffcf46e955f92a072f76fd9f4a29ed9b6f655043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gcite.sty \
texlive-gcite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
