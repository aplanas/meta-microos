SUMMARY = "Convenience package for float placement"
DESCRIPTION = "The hep-float package redefines some LaTeX float placement \
defaults and defines convenience wrappers for floats. The \
package is loaded with \\usepackage{hep-float}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64904"

RPM_NAME = "texlive-hep-float-2023.201.1.1svn64904-53.2.noarch.rpm"
RPM_HASH = "d8b7a29d57cf5e1596fce6f2f4d146a3116749113975cde57cb1ad9b9ad46a47f94e3c011cc820cf2635c832183fda563a0ca3f18229c30d63d2caf48f824116"
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
