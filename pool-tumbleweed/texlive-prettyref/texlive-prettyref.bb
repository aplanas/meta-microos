SUMMARY = "Make label references 'self-identify'"
DESCRIPTION = "Prettyref provides a command \\newrefformat, which specifies the \
way in which a reference is typeset, according to a label \
'identification'. The identification is set in the \\label \
command, by using prefixed label names; so instead of \
\\label{mysection}, one uses \\label{sec:mysection}, and \
prettyref interprets the 'sec:' part. The package is compatible \
with hyperref and with other packages."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-prettyref-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "2bee69dcfb9a5799f87223f7ccd685f114cbbd3468c2dd531e0bfac58c890b2354f90e5d67f03628abcd2e95e83c931c60a6cb1bafbe13df28d4d33ced6249ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prettyref.sty \
texlive-prettyref"

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
