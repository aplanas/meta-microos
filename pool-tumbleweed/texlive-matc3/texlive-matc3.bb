SUMMARY = "Commands for MatematicaC3 textbooks"
DESCRIPTION = "The package provides support for the Matematica C3 project to \
produce free mathematical text books for use in Italian high \
schools."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn29845"

RPM_NAME = "texlive-matc3-2023.201.1.0.1svn29845-52.1.noarch.rpm"
RPM_HASH = "9b66e66bebc8e7cf150ac374bb0e5ec6f50607d1d676193467a66742f3b8e8abdc1df79e0b77ca92e3916d28e80aefb9971d24365e3714c779fb1f4533fcc49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matc3.sty \
texlive-matc3"

RDEPENDS:${PN} += "/usr/bin/sh \
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
