SUMMARY = "Increase the number of available output streams in LaTeX"
DESCRIPTION = "The package addresses, for LaTeX documents, the severe \
limitation on the number of output streams that TeX provides. \
The package uses a single TeX output stream, and writes \
'marked-up' output to this stream. The user may then \
post-process the marked-up output file, using LaTeX, and the \
document's output appears as separate files, according to the \
calls made to the package. The output to be post-processed uses \
macros from the widely-available ProTeX package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn19614"

RPM_NAME = "texlive-rvwrite-2023.201.1.2svn19614-53.1.noarch.rpm"
RPM_HASH = "355d9b70212ed13bb835dafd4185547ddcb22d68f2d92c4ae09a5cc477838ecb1c737a2049df361f8b75061c4284686cf943c41ef9246a6b8bcd6b7afdd9eba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rvwrite.sty) \
texlive-rvwrite"

RDEPENDS:${PN} += "/bin/sh \
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
