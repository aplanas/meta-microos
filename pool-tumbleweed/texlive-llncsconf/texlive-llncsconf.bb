SUMMARY = "LaTeX package extending Springer's llncs class"
DESCRIPTION = "The package extends Springer's llncs class for adding \
additional notes describing the status of the paper (submitted, \
accepted) as well as for creating author-archived versions that \
include the references to the official version hosted by \
Springer (as requested by the copyright transfer agreement for \
Springer's LNCS series)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn63136"

RPM_NAME = "texlive-llncsconf-2023.201.1.2.0svn63136-54.1.noarch.rpm"
RPM_HASH = "3da7673d531dd32fa27f96511dac5560d5f5e05faf675743aca2b148b9184ed78e4980e14581ab02cd082b20acaa2f31152cec9f277b0125884987cc8b1fcf8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(llncsconf.sty) \
texlive-llncsconf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(eso-pic.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(rcsinfo.sty) \
tex(svninfo.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
