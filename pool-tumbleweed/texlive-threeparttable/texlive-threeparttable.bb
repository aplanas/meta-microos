SUMMARY = "Tables with captions and notes all the same width"
DESCRIPTION = "Provides a scheme for tables that have a structured note \
section, after the caption. This scheme provides an answer to \
the old problem of putting footnotes in tables -- by making \
footnotes entirely unnecessary. Note that a threeparttable is \
not a float of itself; but you can place it in a table or a \
table* environment, if necessary."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17383"

RPM_NAME = "texlive-threeparttable-2023.209.svn17383-55.1.noarch.rpm"
RPM_HASH = "026af5353490f5d8dac7fdd2561e0a9d50f10ee2e235ed361e4d5e1112ba5674fb4e6c6981dce8755e8b0e0b10c5a0306736c3899441f66df04dc153d2de9ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-3parttable.sty \
tex-threeparttable.sty \
texlive-threeparttable"

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
