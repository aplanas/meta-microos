SUMMARY = "Prepare university course papers"
DESCRIPTION = "Coursepaper is a class with which students can provide simple \
course papers, in a uniform design to ease the task of marking."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-coursepaper-2023.209.2.0svn15878-55.1.noarch.rpm"
RPM_HASH = "5114f49f5bfbfe6b6226e1f8d67192066af0cea57c7e479991c3370a0f45750462209cb83ab5d540a7ce23a1a35f5f293109011008794c0939f1c7d3a4f2c492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coursepaper.cls \
texlive-coursepaper"

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
