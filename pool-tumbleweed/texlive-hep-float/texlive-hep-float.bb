SUMMARY = "Convenience package for float placement"
DESCRIPTION = "The hep-float package redefines some LaTeX float placement \
defaults and defines convenience wrappers for floats. The \
package is loaded with \\usepackage{hep-float}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64904"

RPM_NAME = "texlive-hep-float-2023.201.1.1svn64904-53.1.noarch.rpm"
RPM_HASH = "ede141d8a3eff63acb8c28285e8d550bc71d32b9c95647bd4e73282ee403517b194e47c8c744ecfe8ff0aaaca4a581a5186d1404ddb288f8b969f9c374db025f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-float.sty \
texlive-hep-float"

RDEPENDS:${PN} += "/bin/sh \
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
