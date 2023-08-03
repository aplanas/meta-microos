SUMMARY = "The Plain TeX format"
DESCRIPTION = "Contains files used to build the Plain TeX format, as described \
in the TeXbook, together with various supporting files (some \
also discussed in the book)."
LICENSE = "SUSE-TeX"

PV = "2023.209.3.141592653svn57963"

RPM_NAME = "texlive-plain-2023.209.3.141592653svn57963-52.1.noarch.rpm"
RPM_HASH = "ba305af58d1961d33688968198cef82b9eaa1f9f1ea3dee70456c286d1cbb4be4e3b0557cc42d6d1faeac8b36f3706b9a508f68c2ca2ef6cc6784bd9e2e1a723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontchart.tex \
tex-gkpmac.tex \
tex-letterformat.tex \
tex-list-latin.tex \
tex-list.tex \
tex-llist-latin.tex \
tex-llist.tex \
tex-mptmac.tex \
tex-pdftexmagfix.tex \
tex-picmac.tex \
tex-plain.tex \
tex-wlist.tex \
texlive-plain"

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
