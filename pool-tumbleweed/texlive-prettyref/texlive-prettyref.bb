SUMMARY = "Make label references 'self-identify'"
DESCRIPTION = "Prettyref provides a command \\newrefformat, which specifies the \
way in which a reference is typeset, according to a label \
'identification'. The identification is set in the \\label \
command, by using prefixed label names; so instead of \
\\label{mysection}, one uses \\label{sec:mysection}, and \
prettyref interprets the 'sec:' part. The package is compatible \
with hyperref and with other packages."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-prettyref-2023.209.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "a6192a915e5f76a045d4d725e7bd8a300bb4c141862c79e41a940bbb7b877f735d74f71a944a3f7eeaab8a384f4120f5c1cca875887f47b015d21f6c34eb1f6a"
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
