SUMMARY = "Move floats to the end, leaving markers where they belong"
DESCRIPTION = "Place all floats on pages by themselves at the end of the \
document, optionally leaving markers like '[Figure 3 about \
here]' in the text near to where the figure (or table) would \
normally have occurred. Float types figure and table are \
recognised by the package, unmodified. Since several packages \
define other types of float, it is possible to register these \
float types with endfloat."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.7svn57090"

RPM_NAME = "texlive-endfloat-2023.201.2.7svn57090-53.1.noarch.rpm"
RPM_HASH = "6a19b34cec209cc52e1f2e0d542431cdf177ea159ed25e7cfce45de0ebc0f208c914224b3a2a0962ef0074a5d291db31d7f9d7dc0bd77a90290ae87c11c7c1dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endfloat.sty \
texlive-endfloat"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
