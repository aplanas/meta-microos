SUMMARY = "Plain TeX macros for TUGboat"
DESCRIPTION = "The macros defined in this directory (in files tugboat.sty and \
tugboat.cmn) are used in papers written in Plain TeX for \
publication in TUGboat."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.27svn63386"

RPM_NAME = "texlive-tugboat-plain-2023.209.1.27svn63386-53.1.noarch.rpm"
RPM_HASH = "3c421c31ca552690bef71951bd127607d27a669e252bfc6d5bbb17ba0ae73223f5aa48cdd2ca3e28f27dfb7cc78e0ad77d8139288a329d730004c58d906399bd"
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
