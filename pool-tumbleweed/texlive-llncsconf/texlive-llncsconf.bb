SUMMARY = "LaTeX package extending Springer's llncs class"
DESCRIPTION = "The package extends Springer's llncs class for adding \
additional notes describing the status of the paper (submitted, \
accepted) as well as for creating author-archived versions that \
include the references to the official version hosted by \
Springer (as requested by the copyright transfer agreement for \
Springer's LNCS series)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn63136"

RPM_NAME = "texlive-llncsconf-2023.209.1.2.0svn63136-55.1.noarch.rpm"
RPM_HASH = "5ce3cda758f64263ede46b1f4cb101bf0be45375e6a4105813cb4fd778bb7f85834c207951c2ecc452c83877f1257bcaebd3e68ceaa3c58894bfb01fd974c004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-llncsconf.sty \
texlive-llncsconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-rcsinfo.sty \
tex-svninfo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
