SUMMARY = "Sub-numbering for figures and tables"
DESCRIPTION = "This package enables sub-numbering of floats (figures and \
tables) similar to the subequations-environment of the amsmath \
package. The subfloat package is not to be confused with the \
subfig package which generates sub-figures within one normal \
figure, and manages their placement; subfloat only affects \
captions and numbering."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn29349"

RPM_NAME = "texlive-subfloat-2023.209.2.14svn29349-58.1.noarch.rpm"
RPM_HASH = "6af57fd0b1c48c7f30ec2ae9fbecc26778781a5b7cdce1168a3154a97406c9553715faaa841ac5d21c9e2c78b861b79a9ea102920c6995580e05c697f65e2493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfloat.sty \
texlive-subfloat"

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
