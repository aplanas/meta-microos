SUMMARY = "A MetaPost library for physics textbook illustrations"
DESCRIPTION = "This MetaPost library was initially written to automate some \
elements of black and white illustrations for a physics \
textbook. It provides functions to draw things like lines of \
variable width, shaded spheres, and tubes of different kinds, \
which can be used to produce images of a variety of objects. \
The library also contains functions to draw some objects \
constructed from these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.0svn61944"

RPM_NAME = "texlive-fiziko-2023.201.0.0.2.0svn61944-52.1.noarch.rpm"
RPM_HASH = "22ad4f5a55bc9a51d78425620e0639461a308d5c364818e54ccee60090bfae75a0071f805c3da7b08c89b777c34d7dc1ff59ebe7226dd2bb72829aff2558a5ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fiziko"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
