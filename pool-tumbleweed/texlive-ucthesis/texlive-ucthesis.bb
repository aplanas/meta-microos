SUMMARY = "University of California thesis format"
DESCRIPTION = "A modified version of the standard LaTeX report style that is \
accepted for use with University of California PhD \
dissertations and Masters theses. A sample dissertation source \
and bibliography are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn15878"

RPM_NAME = "texlive-ucthesis-2023.201.3.2svn15878-53.1.noarch.rpm"
RPM_HASH = "2316ba2898fe913777d7e71cc6b565d39d7e00fb3d9f108da8ee519478cb7f8cfa8f104bf824b3a370b8ba0c40b58b93ce1755fbd1940e0661c49077d9151b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uct10.clo \
tex-uct11.clo \
tex-uct12.clo \
tex-ucthesis.cls \
texlive-ucthesis"

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
