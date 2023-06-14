SUMMARY = "Typeset Subversion keywords"
DESCRIPTION = "The svn package lets you typeset (in LaTeX) the value of \
Subversion keywords. It is approximately an equivalent to the \
rcs package, but for Subversion rather than CVS. Details of \
Subversion (a replacement for CVS) is available from the \
project's home site."
LICENSE = "LPPL-1.0"

PV = "2023.201.43svn15878"

RPM_NAME = "texlive-svn-2023.201.43svn15878-57.1.noarch.rpm"
RPM_HASH = "5b0774eb05d8c8b69fba8505fa65e94ecdbd3853c14ece6835e0e56c8f32e82bc7e0b273c988dfb6165df2da611953e75ff4e33e02bea03e7475f517a3f7190e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn.sty \
texlive-svn"

RDEPENDS:${PN} += "/bin/sh \
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
