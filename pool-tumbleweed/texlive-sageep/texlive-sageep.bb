SUMMARY = "Format papers for the annual meeting of EEGS"
DESCRIPTION = "The class provides formatting for papers for the annual meeting \
of the Environmental and Engineering Geophysical Society (EEGS) \
('Application of Geophysics to Engineering and Environmental \
Problems', known as SAGEEP)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-sageep-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "43b8b92fccf32a612ccf1fcc19d5653a96cf236ce5e09ffdfcfe5106455438cc1f083ddebbfd1e72d650607389a646dc357f9504cdd0c8a53464efd58c9adcfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sageep.cls \
texlive-sageep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-indentfirst.sty \
tex-mathptmx.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
