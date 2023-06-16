SUMMARY = "Plain TeX macros for TUGboat"
DESCRIPTION = "The macros defined in this directory (in files tugboat.sty and \
tugboat.cmn) are used in papers written in Plain TeX for \
publication in TUGboat."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.27svn63386"

RPM_NAME = "texlive-tugboat-plain-2023.201.1.27svn63386-52.1.noarch.rpm"
RPM_HASH = "01a784a30ec81aa22e7708b91b22acc593e63670ac33f73024e9f8bc117c6c454a3a09f83b736049aa36e81d675085a634fc9dd6a666ec1ad682341094b3817c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tugboat.sty \
tex-tugproc.sty \
texlive-tugboat-plain"

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
