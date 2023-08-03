SUMMARY = "Visualise the vocal tract using LaTeX and PSTricks"
DESCRIPTION = "The package enables the user to visualise the vocal tract. The \
vocal tract (in the package) is manipulated by a vector of \
articulation parameters according to the S. Maeda model. \
Animation may be achieved by providing a sequence of vectors \
over time (e.g., from Matlab). A sequence of vectors for \
certain German phonemes is embedded in the package, which \
allows for animation when no other vector is available. The \
package's graphics are produced using pstricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn25629"

RPM_NAME = "texlive-vocaltract-2023.209.1svn25629-54.1.noarch.rpm"
RPM_HASH = "cb93c489a85c1c67f91588ce48dd6bae9ae2561a1cb0ff03ff92d92fca8ffaf21ff55526defbd624ce41fbc5e65f93eb119ddddab6baf8e05413577d71af7952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-VocalTract.sty \
texlive-vocaltract"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-animate.sty \
tex-arrayjob.sty \
tex-color.sty \
tex-fltpoint.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-multimedia.sty \
tex-pst-coil.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
