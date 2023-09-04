SUMMARY = "Simple gradient frames around objects"
DESCRIPTION = "The package provides a means of drawing graded frames around \
objects. The gradients of the frames are drawn using the color \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-2023.209.0.0.2svn21387-54.2.noarch.rpm"
RPM_HASH = "ae72cae18e52f64bb7bd043c5c38c784bc9593db10770ffacd1be6e3206fbdb71f8ec8dc7f89fe43667431c2c13d85cb661b2a9953ab4dd573453b4b962d5a45"
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
