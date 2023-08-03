SUMMARY = "A thesis class file for York University, Toronto"
DESCRIPTION = "York Graduate Studies has again changed the requirements for \
theses and dissertations. The established york-thesis class \
file now implements the changes made in Spring 2005."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn23348"

RPM_NAME = "texlive-york-thesis-2023.209.3.6svn23348-53.1.noarch.rpm"
RPM_HASH = "336c4ce26de8869aaede71a3b939b5334f180a0c5c891b6d1a3855cdf77fece951ab48042672e2f45d01787d83ee78459ddbd9913a2c28dd6bc998a073ceade7"
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
