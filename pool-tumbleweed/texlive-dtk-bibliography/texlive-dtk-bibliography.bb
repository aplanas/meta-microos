SUMMARY = "Bibliography of 'Die TeXnische Komodie'"
DESCRIPTION = "This package contains the bibliography for 'Die TeXnische \
Komodie', the journal of the German-speaking TeX User Group. It \
is updated on a quarterly basis."
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_04svn65444"

RPM_NAME = "texlive-dtk-bibliography-2023.201.2022_04svn65444-52.1.noarch.rpm"
RPM_HASH = "5eb0a8158443679409e2585baaea4fe71c98ffd2caf79951b3df6a92437011ba10377d97bb41e49b2b3331a802d6b791c388c3b14340df16d7a57f9f9398e16e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtk-authoryear.bbx \
tex-dtk-logos.sty \
texlive-dtk-bibliography"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-dantelogo.sty \
tex-fetamont.sty \
tex-hologo.sty \
tex-iftex.sty \
tex-unicode-math.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
