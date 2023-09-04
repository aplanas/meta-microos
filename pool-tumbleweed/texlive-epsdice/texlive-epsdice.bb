SUMMARY = "A scalable dice 'font'"
DESCRIPTION = "The epsdice package defines a single command \\epsdice that \
takes a numeric argument (in the range 1-6), and selects a face \
image from a file that contains each of the 6 possible die \
faces. The graphic file is provided in both Encapsulated \
PostScript and PDF formats."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-epsdice-2023.209.2.1svn15878-54.2.noarch.rpm"
RPM_HASH = "d33cb0262ef78009529221b31abd0cc05300189209043dba4afa690e4652356144b6d8763d195ea52f7f405de24fbb25a7b129e763e7044ae497543606afc1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsdice.cfg \
tex-epsdice.sty \
texlive-epsdice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
