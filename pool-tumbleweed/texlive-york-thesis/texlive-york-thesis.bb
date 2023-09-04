SUMMARY = "A thesis class file for York University, Toronto"
DESCRIPTION = "York Graduate Studies has again changed the requirements for \
theses and dissertations. The established york-thesis class \
file now implements the changes made in Spring 2005."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn23348"

RPM_NAME = "texlive-york-thesis-2023.209.3.6svn23348-53.2.noarch.rpm"
RPM_HASH = "3341b8429e9490be6f95284d7d23ce24a5be7615714e10293f1a1efeb8d98203b76c1ac4905f806d0f5c73d236775123915dcdd02b9ecc1219f3d4c29ae26e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-york-thesis.cls \
texlive-york-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-makeidx.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
