SUMMARY = "Access TeX systems' 'magic numbers'"
DESCRIPTION = "This package allows access to the various parameter values in \
TeX (catcode values), e-TeX (group, if and node types, and \
interaction mode), and LuaTeX (pdfliteral mode) by a \
hierarchical name system."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn52983"

RPM_NAME = "texlive-magicnum-2023.208.1.7svn52983-53.1.noarch.rpm"
RPM_HASH = "4386051df16b9d4d47bc60146e0b9e120cd32deed32c2ee8c9f2a95c395d11f05fea47bdb3673d23c394bf253dc7be5f0b63a3472344fa8f1eea52e2b64570c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magicnum.sty \
texlive-magicnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
