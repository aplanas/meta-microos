SUMMARY = "Plotting a magnetic field with PSTricks"
DESCRIPTION = "pst-magneticfield is a PSTricks related package to draw the \
magnetic field lines of Helmholtz coils in a two or three \
dimensional view. There are several parameters to create a \
different output. For more information or some examples read \
the documentation of the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.17svn63821"

RPM_NAME = "texlive-pst-magneticfield-2023.209.1.17svn63821-53.1.noarch.rpm"
RPM_HASH = "eb12ce2c6d9b0a8abfe3eae08cf274c0d1ff81b7f4d7e2485e65f4eda28418e44577453f0d47324af5979ebc93a2640bf737e88b622366d53fb48f400ca3ed97"
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
