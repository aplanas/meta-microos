SUMMARY = "Convenience package for float placement"
DESCRIPTION = "The hep-float package redefines some LaTeX float placement \
defaults and defines convenience wrappers for floats. The \
package is loaded with \\usepackage{hep-float}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64904"

RPM_NAME = "texlive-hep-float-2023.209.1.1svn64904-54.1.noarch.rpm"
RPM_HASH = "4f1502fe5ed0ed372a2c2101fbb8e281be8b20a6b03aaaaf073f7f0b57808b8cf1e67e2dc0932d2b649b376a682db25c0206d0f661cdf9c3954fc620c54a7955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-float.sty \
texlive-hep-float"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-multirow.sty \
tex-subcaption.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
