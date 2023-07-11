SUMMARY = "A thesis class file for York University, Toronto"
DESCRIPTION = "York Graduate Studies has again changed the requirements for \
theses and dissertations. The established york-thesis class \
file now implements the changes made in Spring 2005."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn23348"

RPM_NAME = "texlive-york-thesis-2023.201.3.6svn23348-52.2.noarch.rpm"
RPM_HASH = "489e2f3d62bc6ecb26a673f8065a9326f1a2bdfb08d2e0911cecde3babb7c111e54cdee4f94dae30d95d01888b9cfa6a2ee638201e3104ee6818e49220368d7e"
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
