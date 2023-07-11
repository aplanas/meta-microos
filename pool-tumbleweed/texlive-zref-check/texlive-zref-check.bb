SUMMARY = "Flexible cross-references with contextual checks based on zref"
DESCRIPTION = "This package provides an user interface for making LaTeX \
cross-references flexibly, while allowing to have them checked \
for consistency with the document structure as typeset. \
Statements such as 'above', 'on the next page', 'previously', \
'as will be discussed', 'on the previous chapter' and so on can \
be given to \\zcheck in free-form, and a set of 'checks' can be \
specified to be run against a given 'label', which will result \
in a warning at compilation time if any of these checks fail. \
\\zctarget and the zcregion environment are also defined as a \
means to easily set label targets to arbitrary places in the \
text which can be referred to by \\zcheck."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn63845"

RPM_NAME = "texlive-zref-check-2023.201.0.0.3.2svn63845-52.2.noarch.rpm"
RPM_HASH = "6299398bb934bdfe2b721ed07203f93e3daa107aa1f55f8da4ff976d3fc3ffff3507ad6b6047c2b949485dbc22e99711db6902192f11c76b69c0257dc846d23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-check.sty \
texlive-zref-check"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifdraft.sty \
tex-zref-abspage.sty \
tex-zref-hyperref.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
