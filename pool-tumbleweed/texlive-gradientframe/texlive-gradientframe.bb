SUMMARY = "Simple gradient frames around objects"
DESCRIPTION = "The package provides a means of drawing graded frames around \
objects. The gradients of the frames are drawn using the color \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-2023.201.0.0.2svn21387-53.2.noarch.rpm"
RPM_HASH = "968cf634a5b483fb3705df20323f11963161e917db4f07875bbcec28d15d696d1040cd0251b64aed1d52f02cba45b6d66b9c464e7e54ac67c2c754d6a0f80e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradientframe.sty \
texlive-gradientframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
