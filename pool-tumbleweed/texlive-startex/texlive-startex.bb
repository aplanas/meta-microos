SUMMARY = "An XML-inspired format for student use"
DESCRIPTION = "A TeX format designed to help students write short reports and \
essays. It provides the user with a suitable set of commands \
for such a task. It is also more robust than plain TeX and \
LaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.04svn35718"

RPM_NAME = "texlive-startex-2023.209.1.04svn35718-58.1.noarch.rpm"
RPM_HASH = "98dc7391e4575c10eb314e4660fcefdd1f34e6239cb0b02c83884065f371f3e12b6c371c1274b602f57ee51c3a5e68d46721c7e645c88368b8230f02d04564e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-startex.tex \
texlive-startex"

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
