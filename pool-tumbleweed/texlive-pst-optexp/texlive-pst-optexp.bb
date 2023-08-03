SUMMARY = "Drawing optical experimental setups"
DESCRIPTION = "The package is a collection of optical components that \
facilitate easy sketching of optical experimental setups. The \
package uses PSTricks for its output. A wide range of free-ray \
and fibre components is provided, the alignment, positioning \
and labelling of which can be achieved in very simple and \
flexible ways. The components may be connected with fibers or \
beams, and realistic raytraced beam paths are also possible."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1svn62977"

RPM_NAME = "texlive-pst-optexp-2023.209.6.1svn62977-53.1.noarch.rpm"
RPM_HASH = "954021557f90803392b6bf1feb47f91ecf61244c33090e3f207544c244227031c080eb62aafd0b194536759500e46035d0a28fe538c5240e506ba2a6e0803b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-optexp.sty \
texlive-pst-optexp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-eucl.sty \
tex-pst-intersect.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pst-xkey.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
