SUMMARY = "Plotting a magnetic field with PSTricks"
DESCRIPTION = "pst-magneticfield is a PSTricks related package to draw the \
magnetic field lines of Helmholtz coils in a two or three \
dimensional view. There are several parameters to create a \
different output. For more information or some examples read \
the documentation of the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn63821"

RPM_NAME = "texlive-pst-magneticfield-2023.201.1.17svn63821-52.1.noarch.rpm"
RPM_HASH = "3158f58115c1a2ac2794e91e8ded8907122297e968530104beb8f233717af28efae9044b497ea9d2fe6b8bc4c5d1d63ae33e99e5a3926f4f3bc85a5886ba14d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-magneticfield.sty \
tex-pst-magneticfield.tex \
texlive-pst-magneticfield"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-3d.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
