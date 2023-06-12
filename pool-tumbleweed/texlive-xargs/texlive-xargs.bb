SUMMARY = "Define commands with many optional arguments"
DESCRIPTION = "The package provides extended versions of \\newcommand and \
related LaTeX commands, which allow easy and robust definition \
of macros with many optional arguments, using a clear and \
simple xkeyval-style syntax."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xargs-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "b5ac53cc2b7db40eecd37fefca4789a90843900fc48763bd4f9eeca1352019e1932e93fcf1bb62cf9f17eb8378663cc6a268fe66883fd582612337b9b5ae41b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xargs.sty) \
texlive-xargs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
