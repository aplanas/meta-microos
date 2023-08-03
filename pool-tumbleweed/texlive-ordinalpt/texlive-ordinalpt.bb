SUMMARY = "Counters as ordinal numbers in Portuguese"
DESCRIPTION = "The package provides a counter style (like \\arabic, \\alph and \
others) which produces as output strings like 'primeiro' \
('first' in Portuguese), 'segundo' (second), and so on up to \
1999th. Separate counter commands are provided for different \
letter case variants, and for masculine and feminine gender \
inflections."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-ordinalpt-2023.209.2.1svn15878-55.1.noarch.rpm"
RPM_HASH = "32d9afa982ea6b3efba3c50463bc16acf452ecb9f25f211bf2486c1d3e9f19dd06455d799b8fc75f6c635d05a2367b5bf9c86396a5abacd94497d4780753a6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ordinalpt.sty \
texlive-ordinalpt"

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
