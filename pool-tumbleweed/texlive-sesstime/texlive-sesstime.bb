SUMMARY = "Session and timing information in lecture notes"
DESCRIPTION = "This LaTeX2e package makes it possible to add timing marks to \
lecture notes in order to help managing the time available for \
presenting a given section of the document. It also provides \
tools to record and estimate the progress throughout the \
course."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn49750"

RPM_NAME = "texlive-sesstime-2023.201.1.12svn49750-53.1.noarch.rpm"
RPM_HASH = "737f7e677594be5adc6cef4247234aed66531d5d4a98b392289fc148488b97c98407a522b579d13248cc41f3606c7253f6cf4059d76b87842bb0c7073245a935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sesstime.sty) \
texlive-sesstime"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
