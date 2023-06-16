SUMMARY = "LaTeX support for Metafont logo fonts"
DESCRIPTION = "LaTeX package and font definition file to access the Knuthian \
mflogo fonts described in 'The Metafontbook' and to typeset \
Metafont logos in LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn42428"

RPM_NAME = "texlive-mflogo-2023.201.2.0svn42428-54.1.noarch.rpm"
RPM_HASH = "b4978edfa8ab96def8f2c6f6ba43abced4fbc2a99805c2126ec221952aebea25cd7ab39e72e84897ea4dd30f64969ae5c94588b3d2137bbeb0e2d5fffafe0f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logosl8.tfm \
tex-mflogo.sty \
tex-ulogo.fd \
texlive-mflogo"

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
