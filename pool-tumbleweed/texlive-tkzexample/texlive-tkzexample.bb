SUMMARY = "Package for the documentation of all tkz-* packages"
DESCRIPTION = "This package is needed to compile the documentation of all \
tkz-* packages (like tkz-euclide)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.45csvn63908"

RPM_NAME = "texlive-tkzexample-2023.201.1.45csvn63908-52.1.noarch.rpm"
RPM_HASH = "28a55080561668586237be90a1369f30f959a49402d8e6c934fda773b38d9b2f01f56d91eda911fee74da18bd66df21a05751fa3a266239f22ba8112c5d317fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkzexample.sty \
texlive-tkzexample"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyvrb.sty \
tex-mdframed.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
