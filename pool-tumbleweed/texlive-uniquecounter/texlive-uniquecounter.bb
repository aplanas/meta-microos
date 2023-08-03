SUMMARY = "Provides unlimited unique counter"
DESCRIPTION = "This package provides a kind of counter that provides unique \
number values. Several counters can be created with different \
names. The numeric values are not limited."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn53162"

RPM_NAME = "texlive-uniquecounter-2023.209.1.4svn53162-54.1.noarch.rpm"
RPM_HASH = "6a36836826a090ef40f01c0a140ea0b40c253e41b408137db613c7c1fdd10e27239c2f0bc18f2ed13df05be7dbbc267956c8284d426f6b4b50965fce39d03a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uniquecounter.sty \
texlive-uniquecounter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bigintcalc.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
