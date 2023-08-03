SUMMARY = "A scalable dice 'font'"
DESCRIPTION = "The epsdice package defines a single command \\epsdice that \
takes a numeric argument (in the range 1-6), and selects a face \
image from a file that contains each of the 6 possible die \
faces. The graphic file is provided in both Encapsulated \
PostScript and PDF formats."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-epsdice-2023.209.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "9cc70c76ac6bf81dc0b1ca7f365f4ac799b7bfd1f6ef4e5bd7fb2689ccbb0edb77bc6e0099d5b0fc0d10eb30c21e16b122ed623997a117aa9ef60142384802ae"
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
