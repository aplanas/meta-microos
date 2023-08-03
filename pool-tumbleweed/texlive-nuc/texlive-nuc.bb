SUMMARY = "Notation for nuclear isotopes"
DESCRIPTION = "A simple package providing nuclear sub- and superscripts as \
commonly used in radiochemistry, radiation science, and nuclear \
physics and engineering applications. Isotopes which have Z \
with more digits than A require special spacing to appear \
properly; this spacing is supported in the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn22256"

RPM_NAME = "texlive-nuc-2023.209.0.0.1svn22256-55.1.noarch.rpm"
RPM_HASH = "f4e26fe1c523c00ea89a6a21cb0dc05b9d8a2b0bdbc899951ed1dc06f5818c1bcc747a056e365d493a5e66718da88b055d11f3493e1ef2be8aa216722ac9b411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nuc.sty \
texlive-nuc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
