SUMMARY = "String manipulation in LaTeX"
DESCRIPTION = "Coolstr is a subpackage of the cool bundle that deals with the \
manipulation of strings. A string is defined as a sequence of \
characters (not tokens). The package provides the ability to \
access a specific character of a string, as well as determine \
if the string contains numeric or integer data."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.204.2.2svn15878"

RPM_NAME = "texlive-coolstr-2023.204.2.2svn15878-54.1.noarch.rpm"
RPM_HASH = "b6a71ed4e24c1612943505a91b42d042ad5f8aec2059148345b92629d708be91557981bf138b0ee755d43807ed342d26acc6abf20df2ea526bab37a15bcdd326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolstr.sty \
texlive-coolstr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
