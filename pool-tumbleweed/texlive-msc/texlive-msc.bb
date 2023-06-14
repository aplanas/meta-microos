SUMMARY = "Draw MSC diagrams"
DESCRIPTION = "The package should be useful to all people that prepare their \
texts with LaTeX and want to draw Message Sequence Charts in \
their texts. The package is not an MSC editor; it simply takes \
a textual description of an MSC and draws the corresponding \
MSC. The current version of the MSC macro package supports the \
full MSC2000 language."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn63291"

RPM_NAME = "texlive-msc-2023.201.2.00svn63291-54.1.noarch.rpm"
RPM_HASH = "13c81dd73a781f07edd079891ebf446fa2f8afb657173bfdbbfca419b1d41aeca22598ca9239b5d571c37b8090c98dd52d1439ea5c84b7beef7606d74b15843f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msc.sty \
texlive-msc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
