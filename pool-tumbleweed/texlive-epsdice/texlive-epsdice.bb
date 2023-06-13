SUMMARY = "A scalable dice 'font'"
DESCRIPTION = "The epsdice package defines a single command \\epsdice that \
takes a numeric argument (in the range 1-6), and selects a face \
image from a file that contains each of the 6 possible die \
faces. The graphic file is provided in both Encapsulated \
PostScript and PDF formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-epsdice-2023.201.2.1svn15878-53.1.noarch.rpm"
RPM_HASH = "fe121f9ae0e5c52ae83972575f8b3b9a076caa9892e02720211e7ec6742b46f72f90cc20b387f4592dc57c47ca1175ba2aaa1538e6f56ed0d410c79725b71d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epsdice.cfg) \
tex(epsdice.sty) \
texlive-epsdice"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
