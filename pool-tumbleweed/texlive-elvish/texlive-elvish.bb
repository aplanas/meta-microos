SUMMARY = "Fonts for typesetting Tolkien Elvish scripts"
DESCRIPTION = "The bundle provides fonts for Cirth (cirth.mf, etc.) and for \
Tengwar (teng10.mf). The Tengwar fonts are supported by macros \
in teng.tex, or by the (better documented) tengtex package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-elvish-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "9075126728919334418256e96055d629939969778616ca66fc3447a1d780f50a08a36b3883b875f0f61994cb41c64c66385d33b663f1b05873116cb3d3dd0e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cirth.tfm \
tex-teng10.tfm \
texlive-elvish"

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
