SUMMARY = "Sub-numbering for figures and tables"
DESCRIPTION = "This package enables sub-numbering of floats (figures and \
tables) similar to the subequations-environment of the amsmath \
package. The subfloat package is not to be confused with the \
subfig package which generates sub-figures within one normal \
figure, and manages their placement; subfloat only affects \
captions and numbering."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn29349"

RPM_NAME = "texlive-subfloat-2023.201.2.14svn29349-57.1.noarch.rpm"
RPM_HASH = "4f6397ff2823f12ba84f48734c766600efa03f7e1e94d0813aab84243813d598844e67b42e0a3d5923bf373bf1b8a1fbe641c91788915337050562ca0287ce10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subfloat.sty) \
texlive-subfloat"
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
