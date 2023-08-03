SUMMARY = "Support for cropmarks"
DESCRIPTION = "A package providing corner marks for camera alignment as well \
as for trimming paper stacks, and additional page information \
on every page if required. Most macros are easily adaptable to \
personal preferences. An option is provided for selectively \
suppressing graphics or text, which may be useful for printing \
just colour graphics on a colour laser printer and the rest on \
a cheap mono laser printer. A page info line contains the time \
and a new cropmarks index and is printed at the top of the \
page. A configuration command is provided for the info line \
font. Options for better collaboration with dvips, pdfTeX and \
vtex are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10.2svn55424"

RPM_NAME = "texlive-crop-2023.209.1.10.2svn55424-55.1.noarch.rpm"
RPM_HASH = "42f7a413675ec552f94a6c3e2b53328d533a2a710bc80a3b5c0c0f79cc985865f57eca7aa148d21598464509592bd1bf8e3ea0758db29046a13e5fa6bc27292c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crop.sty \
texlive-crop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
