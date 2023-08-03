SUMMARY = "Extended verbatim"
DESCRIPTION = "A collection of verbatim facilities that provide line-numbered \
verbatim, verbatim that obeys TAB characters, verbatim input \
and verbatim output to file. The package makes use of the LaTeX \
required verbatim package. The package is formed from a series \
of small pieces, and is somewhat unstructured. The user who \
looks for thought-through verbatim facilities is advised to \
consider using the fancyvrb package in place of moreverb."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3asvn22126"

RPM_NAME = "texlive-moreverb-2023.209.2.3asvn22126-55.1.noarch.rpm"
RPM_HASH = "14c2d0fb27826f222b3a3b4131a40a26f014db4c99dc96ba627b605568f77dbb18848dd531c440f9f04ce3a82a5982eb38f13990d3ad247e893f0d6c4aaa295a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moreverb.sty \
texlive-moreverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
