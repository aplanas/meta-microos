SUMMARY = "Load patches for packages"
DESCRIPTION = "Hopatch provides a command with which the user may register of \
patch code for a particular package. Hopatch will apply the \
patch immediately, if the relevant package has already been \
loaded; otherwise it will store the patch until the package \
appears."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn65491"

RPM_NAME = "texlive-hopatch-2023.201.1.5svn65491-53.2.noarch.rpm"
RPM_HASH = "e0b14cf87766f72b02ec0e44e9be343bedf2f96f1bc4696058d573cacd1c97bc3e9c627ae9a7fd7956b1e01ccc56ba3d9c2722cb352581e4177ae7ea57667637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hopatch-2016-05-16.sty \
tex-hopatch.sty \
texlive-hopatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
